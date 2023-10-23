package management_codegym.view;

import java.util.Scanner;
import management_codegym.controller.StudentController;
import management_codegym.controller.TeacherController;


public class CodeGymManagement {

  public static void main(String[] args) {
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();
    do {

      System.out.println("\n-------------------------------------------------------------");
      System.out.println("Vui lòng chọn chức năng:\n" +
          "1. Thêm mới giảng viên hoặc học sinh.\n" +
          "2. Xóa giảng viên hoặc học sinh. \n" +
          "3. Xem danh sách giảng viên hoặc học sinh. \n" +
          "4. Thoát. \n");
      System.out.print("Nhập chức năng : ");
      Scanner scanner = new Scanner(System.in);
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1:

          studentController.addStudent();
          break;
        case 2:
          studentController.deleteStudent();
          break;
        case 3:
          studentController.showListStudent();
          break;
        case 4:
          System.out.println("Hẹn gặp lại");
          System.exit(1);
        default:
          System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
          break;


      }
    } while (true);


  }
}
