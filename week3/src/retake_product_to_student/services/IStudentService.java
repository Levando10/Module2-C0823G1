package retake_product_to_student.services;

import java.util.List;
import retake_product_to_student.models.Student;

public interface IStudentService {

  List<Student> getAllSttudent();

  void addStudent(Student student);
}
