package Assignment3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import proto.building.Building;
import proto.building.BuildingList;
import proto.employee.Employee;
import proto.employee.EmployeeList;
import proto.employee.Floor;

import java.io.*;

import static Constants.HDFSConstants.BUILDING_CSV_PATH;
import static Constants.HDFSConstants.EMP_CSV_PATH;




public class ConvertCSVToProto {

    public static void main(String[] args) throws IOException {
        BuildingList.Builder buildingList = convertBuildingDataToProto();
        EmployeeList.Builder employeeList = convertEmployeeDataToProto();
        buildingList.build();
        employeeList.build();

        String buildingProtoToJson = JsonFormat.printer().print(buildingList);
        String employeeProtoToJson = JsonFormat.printer().print(employeeList);
        System.out.println(buildingProtoToJson);
        System.out.println(employeeProtoToJson);

    }

    public static EmployeeList.Builder convertEmployeeDataToProto() {
        EmployeeList.Builder employeeList = EmployeeList.newBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(EMP_CSV_PATH))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] data = line.split(",");
                Employee.Builder employee = Employee.newBuilder();
                employee.setName((data[0]));
                employee.setEmployeeId(Integer.parseInt(data[1]));
                employee.setBuildingCode(Integer.parseInt(data[2]));
                employee.setFloorNumber(Floor.forNumber(Integer.parseInt(data[3])));
                employee.setSalary(Integer.parseInt(data[4]));
                employee.setDepartment((data[5]));
                employee.build();
                employeeList.addEmployees(employee);
            }

        } catch (NullPointerException | NumberFormatException | IOException  e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static BuildingList.Builder convertBuildingDataToProto() {
        BuildingList.Builder buildingList = BuildingList.newBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(BUILDING_CSV_PATH))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] data = line.split(",");
                Building.Builder building = Building.newBuilder();
                building.setBuildingCode(Integer.parseInt(data[0]));
                building.setTotalFloors(Integer.parseInt(data[1]));
                building.setCompaniesInTheBuilding(Integer.parseInt(data[2]));
                building.setCafteriaCode(Integer.parseInt(data[3]));
                building.build();
                buildingList.addBuildings(building);
            }

        } catch (NullPointerException | NumberFormatException | IOException  e) {
            e.printStackTrace();
        }
        return buildingList;
    }

    private static void writeToFile(BuildingList.Builder buildingList, EmployeeList.Builder employeeList, File fileName) throws IOException {
        FileOutputStream empOutPutFile = new FileOutputStream(fileName);
        JsonFormat.Printer printer = JsonFormat.printer()
                .includingDefaultValueFields()
                .preservingProtoFieldNames();
        String jsonString=null;
        if(buildingList != null) {
            jsonString = printer.print(buildingList);
        }else{
            jsonString = printer.print(employeeList);
        }

        empOutPutFile.write(jsonString.getBytes());
        empOutPutFile.close();
    }
}
