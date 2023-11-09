package utils.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

public class ReadFileEmployee {

  private static final String PATH = "EmployeeManagement/src/data/employeeList.csv";

  public static List<Employee> readFileEmployee(){
    List<Employee> employeeList = new ArrayList<>();
    File file = new File(PATH);
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    Employee employee;

    try {
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);
      String temp;
      String []tempArr;

      while ((temp = bufferedReader.readLine()) != null){
        tempArr = temp.split(",");
        employee = new Employee(tempArr[0],tempArr[1],tempArr[2],tempArr[3],tempArr[4],tempArr[5],tempArr[6],tempArr[7],Long.parseLong(tempArr[8]));
        employeeList.add(employee);
      }
      return employeeList;

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        if (bufferedReader != null){
          bufferedReader.close();
        }
        if (fileReader != null){
          fileReader.close();
        }


      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }


  }
}
