package retake_product_to_student.repositories;

import java.util.ArrayList;
import java.util.List;
import retake_product_to_student.models.Student;

public class StudentRepository implements IStudentRepository{
  private static List<Student> students = new ArrayList<>();

  static {
   students.add(new Student(1,"Lê Văn Độ",4));
    students.add(new Student(2,"Thanh tùng",8));
    students.add(new Student(3,"Nhật Linh",3));
    students.add(new Student(4,"Lê Nhật Bảo",6));
    students.add(new Student(5,"Lê Anh Tuấn",9));

  }

  @Override
  public List<Student> getAllStudent() {
    return students;
  }

  @Override
  public void addStudent(Student student) {
students.add(student);
  }
}
