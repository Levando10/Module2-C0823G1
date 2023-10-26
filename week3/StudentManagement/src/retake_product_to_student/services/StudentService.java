package retake_product_to_student.services;

import java.util.List;
import retake_product_to_student.models.Student;
import retake_product_to_student.repositories.IStudentRepository;
import retake_product_to_student.repositories.StudentRepository;
import retake_product_to_student.util.Validation;

public class StudentService implements IStudentService {

  Student student;
  private IStudentRepository iStudentRepository = new StudentRepository();

  @Override
  public List<Student> getAllSttudent() {
    return iStudentRepository.getAllStudent();
  }

  @Override
  public void addStudent(Student student) {
    iStudentRepository.addStudent(student);
  }

  @Override
  public boolean removeStudent(Integer id) {
    student = iStudentRepository.findById(id);
    if (student == null) {
      return false;
    } else {
      System.out.print("Bạn có muốn xóa hay không (y hoặc Y để xóa , n hoặc N để hủy xóa) : ");
      Character character = Validation.checkYesNo();
      if (character.equals('y') || character.equals('Y')) {
        iStudentRepository.removeStudent(id);
        return true;
      } else {
        return true;
      }

    }

  }

  @Override
  public Student checkStudent(Integer id) {
    return student = iStudentRepository.findById(id);
  }

  @Override
  public Student findStudent(String name) {

    return  iStudentRepository.findStudent(name);
  }

  @Override
  public void sortStudent() {
    iStudentRepository.sortStudent();
  }




  @Override
  public void editStudent(Student student) {
    iStudentRepository.editStudent(student);
  }
}
