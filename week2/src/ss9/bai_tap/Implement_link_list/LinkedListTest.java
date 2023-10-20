package ss9.bai_tap.Implement_link_list;

public class LinkedListTest {

  public static void main(String[] args) {
    class Student {

      private int id;
      private String name;

      public Student() {
      }

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
    MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
    Student student1 = new Student(1, " van do ");
    Student student2 = new Student(2, " van bao ");
    Student student3 = new Student(3, " nhat bao ");
    Student student4 = new Student(4, " anh taun ");
    Student student5 = new Student(5, " nhat tung ");

    myLinkedList.addFirst(student1);
    myLinkedList.addFirst(student2);
    myLinkedList.addLast(student3);
    myLinkedList.addLast(student4);

    System.out.println("\n");

    for (int i = 0; i < myLinkedList.size(); i++) {
      Student student = (Student) myLinkedList.get(i);
      System.out.println(student.getName());

    }
    System.out.println(myLinkedList.constain(student3));
    System.out.println("Index of : " + myLinkedList.indexOf(student4));

    MyLinkedList<Student> cloneList = myLinkedList.clone();
    System.out.println("\n");

//    for (int i = 0; i < cloneList.size(); i++) {
//      Student student = (Student) cloneList.get(i);
//      System.out.println(student.getId() + " " + student.getName());
//    }

  }

}
