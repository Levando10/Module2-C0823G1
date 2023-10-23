package ss8_mvc.repository;


import java.util.ArrayList;
import java.util.Scanner;
import ss8_mvc.model.Student;

public class StudentRepository implements IStudentRepository {

  ArrayList<Student> studentArrayList = new ArrayList<>();

  //add
  @Override
  public void addStudent() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap id sinh vien : ");
    int identify = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Nhap ten sinh vien : ");
    String name = scanner.nextLine();

    Student student = new Student(identify, name);
    studentArrayList.add(student);
  }

  //delete
  @Override
  public void deleteStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập id muốn xóa : ");
    int idDelete = scanner.nextInt();

    for (int i = 0; i < studentArrayList.size(); i++) {
      if (studentArrayList.get(i).getId() == idDelete) {
        studentArrayList.remove(i);
      }
    }
  }

  @Override
  public void editStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập id : ");
    int idEit = scanner.nextInt();


    for (int i = 0; i < studentArrayList.size(); i++) {
      if (studentArrayList.get(i).getId() == idEit){
        scanner.nextLine();
        System.out.print("Nhập tên cần sửa : ");
        String name = scanner.nextLine();
        studentArrayList.get(i).setName(name);
      }
    }


  }

  @Override
  public void showList() {
    for (Student s : studentArrayList) {
      System.out.println(s);
    }
  }
}
