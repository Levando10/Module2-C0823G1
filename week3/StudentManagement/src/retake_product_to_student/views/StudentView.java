package retake_product_to_student.views;


import java.util.List;
import retake_product_to_student.controllers.StudentController;
import retake_product_to_student.models.Student;
import retake_product_to_student.util.Validation;

public class StudentView {

  public static void main(String[] args) {
    StudentController studentController = new StudentController();
    int choice;
    boolean isSuccess;
    Student student;
    Integer id;
    List<Student> students;
    do {
      System.out.println("--------Menu---------");
      System.out.println("1. Danh sách sinh viên");
      System.out.println("2. Thêm sinh viên");
      System.out.println("3. Xóa sinh viên");
      System.out.println("4. Sửa sinh viên");
      System.out.println("5. Tìm sinh viên");
      System.out.println("6. sắp xêp sinh viên theo điểm");
      System.out.println("0. Exit");
      System.out.print("Nhập lựa chọn: ");
      choice = Validation.checkInputLimit(0, 6);
      switch (choice) {
        case 1:
          students = studentController.getAllStudent();
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
          id = inputId();
          isSuccess = studentController.removeStudent(id);
          if (isSuccess) {
            System.out.println(" Thành công!!!");
          } else {
            System.out.println("Không tìm thấy Id!!!");
          }
          break;
        case 4:
          id = inputId();
          student = studentController.checkStudent(id);
          if (student != null){
            System.out.println("Bạn có muốn sửa học sinh có  : " + student + " hay không !!!");
            System.out.print("Chọn y hoặc y để đồng ý sửa , N hoặc n để hủy sửa : ");
            Character character = Validation.checkYesNo();
            if (character.equals('y') || character.equals('Y')){
              System.out.print("Nhập tên : ");
              String name = Validation.checkInputString();
              System.out.print("Nhập điểm : ");
              Integer score = Validation.checkInputInteger();
              student = new Student(id, name, score);
              studentController.editStudent(student);
              System.out.println("Sau khi sửa : "+ student);
            }
          } else {
            System.out.println("Không tìm thấy Id!!!");
          }

          break;
        case 5:
          System.out.print("Nhập tên sinh viên cần tìm : ");
          String name = Validation.checkInputString();
          student = studentController.findStudent(name);
          if (student == null){
            System.out.println("Không tìm thấy!!!");
          } else {
            System.out.println(student);
          }

          break;
        case 6:
          System.out.println("Hiển thị danh sách tăng dần !!!");
          studentController.sortStudent();
          students = studentController.getAllStudent();
          for (Student temp : students) {
            System.out.println(temp);
          }
          break;
        case 0:
          System.exit(0);
      }
    } while (true);
  }

  private static Integer inputId() {
    System.out.print("Nhập id : ");
    return Validation.checkInputInteger();
  }

  private static Student inputInformation() {
    System.out.print("Nhập tên : ");
    String name = Validation.checkInputString();
    System.out.print("Nhập điểm :  ");
    Integer score = Validation.checkInputLimit(0, 10);
    return new Student(name, score);
  }
}
