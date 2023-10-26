package retake_product_to_student.services;

import java.util.List;
import retake_product_to_student.models.Student;
import retake_product_to_student.repositories.IStudentRepository;
import retake_product_to_student.repositories.StudentRepository;

public class StudentService implements IStudentService{
private IStudentRepository iStudentRepository = new StudentRepository();
  @Override
  public List<Student> getAllSttudent() {
    return iStudentRepository.getAllStudent();
  }

  @Override
  public void addStudent(Student student) {
    iStudentRepository.addStudent(student);
  }
}
