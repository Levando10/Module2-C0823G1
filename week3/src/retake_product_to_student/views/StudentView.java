package retake_product_to_student.views;

import demo_mvc.src.utils.validate.Validation;
import java.util.List;
import retake_product_to_student.controllers.StudentController;
import retake_product_to_student.models.Student;

public class StudentView {

  public static void main(String[] args) {
    StudentController studentController = new StudentController();
    int choice;
  Student student;
  Integer id;
    do {
      System.out.println("--------Menu---------");
      System.out.println("1. Danh sách sinh viên");
      System.out.println("2. Thêm sinh viên");
      System.out.println("3. Xóa sinh viên");
      System.out.println("4. Sửa sinh viên");
      System.out.println("5. sắp xêp sinh viên theo điểm");
      System.out.println("0. Exit");
      System.out.print("Nhập lựa chọn: ");
      choice = Validation.checkInputLimit(0, 5);
      switch (choice) {
        case 1:
          List<Student> students = studentController.getAllStudent();
          for (Student temp : students) {
            System.out.println(temp);
          }
          break;
        case 2:
          id = inputId();
          student = inputInformation();
          student.setId(id);
          studentController.addStudent(student);


          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 0:
          System.exit(0);
      }
    } while (true);
  }
  private static Integer inputId(){
    System.out.print("Nhập id : ");
    return Validation.checkInputInteger();
  }
  private static Student inputInformation(){
    System.out.print("Nhập tên : ");
    String name = Validation.checkInputString();
    System.out.print("Nhập điểm :  ");
    Integer score = Validation.checkInputLimit(0,10);
    return new Student(name,score);
  }
}
