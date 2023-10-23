package management_codegym.repository;

import java.util.ArrayList;
import java.util.Scanner;
import management_codegym.model.Person;
import management_codegym.model.Student;

public class ManagementStudentAndTeacher implements IStudentRepository,ITeacherRepository{

  public static ArrayList<Person> personArrayList = new ArrayList<>();

  @Override
  public void showListStudent() {
    for (Person student : personArrayList) {
      System.out.println(student);
    }
  }

  @Override
  public void addStudent() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập id sinh viên : ");
    int id = scanner.nextInt();

    scanner.nextLine();
    System.out.print("Nhập tên sinh viên : ");
    String name = scanner.nextLine();


    System.out.print("Nhập ngày sinh : ");
    String dateBirth = scanner.nextLine();


    System.out.print("Nhập lớp : ");
    String classes = scanner.nextLine();


    System.out.print("Điểm Số : ");
    int score = scanner.nextInt();

    scanner.nextLine();
    System.out.print("Nhập giới tính : ");
    String gender = scanner.nextLine();
    Student student = new Student(id,name,dateBirth,gender,classes,score);

    ManagementStudentAndTeacher.personArrayList.add(student);
  }

  @Override
  public void deleteStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập id muốn xóa : ");
    int idDelete = scanner.nextInt();

    for (int i = 0; i < personArrayList.size(); i++) {
      if (personArrayList.get(i).getId() == idDelete) {
        scanner.nextLine();
        System.out.print("Bạn có muốn xóa (y or n)");
        String checkYesNo = scanner.nextLine();
        if (checkYesNo.charAt(0) == 'y'){
          personArrayList.remove(i);
          break;
        } else {
          break;
        }


      }
    }
  }

  @Override
  public void showListTeacher() {


  }

  @Override
  public void addTeacher() {

  }

  @Override
  public void deleteTeacher() {

  }
}
