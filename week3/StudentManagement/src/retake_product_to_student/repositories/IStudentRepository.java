package retake_product_to_student.repositories;

import java.util.List;
import retake_product_to_student.models.Student;

public interface IStudentRepository {

  List<Student> getAllStudent();

  void addStudent(Student student);
  void removeStudent(Integer id);
  Student findById(Integer id);


  Student findStudent(String name);

  void sortStudent();


  void editStudent(Student student);
}
