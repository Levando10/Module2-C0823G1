package retake_product_to_student.repositories;

import java.util.ArrayList;
import java.util.List;
import retake_product_to_student.models.Student;
import retake_product_to_student.util.Validation;

public class StudentRepository implements IStudentRepository {

  private static List<Student> students = new ArrayList<>();

  static {
//    students.add(new Student(1, "Lê Văn Độ", 4));
//    students.add(new Student(2, "Thanh tùng", 8));
//    students.add(new Student(3, "Nhật Linh", 3));
//    students.add(new Student(4, "Lê Nhật Bảo", 6));


  }

  @Override
  public List<Student> getAllStudent() {
    return students;
  }

  @Override
  public void addStudent(Student student) {
    students.add(student);
  }

  @Override
  public void removeStudent(Integer id) {
    for (Student student : students) {
      if (student.getId().equals(id)) {
        students.remove(student);
        break;
      }
    }
  }

  @Override
  public Student findById(Integer id) {
    for (Student student : students) {
      if (student.getId().equals(id)) {
        return student;
      }
    }
    return null;
  }



  @Override
  public Student findStudent(String name) {
    for (Student student : students){
      if (student.getName().toLowerCase().contains(name.toLowerCase())){
        return student;
      }
    }
    return null;
  }

  @Override
  public void sortStudent() {
    students.sort(null);
  }

  @Override
  public void editStudent(Student student) {
    for (Student temp : students) {
      if(temp.getId().equals(student.getId())) {
        temp.setName(student.getName());
        temp.setScore(student.getScore());
      }
    }
  }


}