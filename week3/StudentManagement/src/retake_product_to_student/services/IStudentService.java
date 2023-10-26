package retake_product_to_student.services;

import java.util.List;
import retake_product_to_student.models.Student;

public interface IStudentService {

  List<Student> getAllSttudent();

  void addStudent(Student student);

  boolean removeStudent(Integer id);

  Student checkStudent(Integer id);

  Student findStudent(String name);

  void sortStudent();


  void editStudent(Student student);


}
