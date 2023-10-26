package retake_product_to_student.controllers;

import java.util.List;
import retake_product_to_student.models.Student;
import retake_product_to_student.services.IStudentService;
import retake_product_to_student.services.StudentService;

public class StudentController {
  private IStudentService iStudentService = new StudentService();

  public List<Student> getAllStudent() {
    return iStudentService.getAllSttudent();
  }

  public void addStudent(Student student) {
    iStudentService.addStudent(student);
  }
}
