package ss8_mvc.view;

import ss8_mvc.controller.StudentController;

import java.util.Scanner;

public class CodegymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        do{

            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Xem danh sách.\n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Sửa học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Thoát chương trình");
            System.out.print("Nhập chức năng : ");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentController.showList();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    studentController.editStudent();
                    break;
                case 4:
                    studentController.deleteStudent();
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        }while (true);

    }
}
