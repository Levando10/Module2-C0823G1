package ss9.bai_tap.Implement_array_list;

import java.util.Arrays;

public class MyArrayListTest {

  public static class Student {

    public int id;
    public String name;

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Student student1 = new Student(1, "Lê Văn Độ");
    Student student2 = new Student(2, "Lê tu thanh");
    Student student3 = new Student(3, "Lê Văn duy333");
    Student student4 = new Student(4, "Lê hà hiếu duy");
    Student student5 = new Student(5, "phần tử chèn");

    MyArrayList<Student> studentList = new MyArrayList<>();
    MyArrayList<Student> newArr = new MyArrayList<>();

    studentList.addStudent(student1);
    studentList.addStudent(student2);
    studentList.addStudent(student3);
    studentList.addStudent(student4);

    studentList.add(2, student4);

    studentList.addFirst(student5);
    System.out.println(studentList.contains(student5));
    studentList.addLast(student5);
    studentList.remove(6);
    studentList.remove(0);
    System.out.println(studentList.contains(student5));

    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      System.out.println(+student.getId() + "  " + student.getName());
    }

    System.out.println("\nKích thước là : " + studentList.size());
    System.out.println("Phần tử ở vị trí : " + studentList.indexOf(student5));

    newArr = studentList.clone();
    System.out.println();

  }


}
