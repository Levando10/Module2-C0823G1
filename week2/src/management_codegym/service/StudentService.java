package management_codegym.service;


import management_codegym.repository.IStudentRepository;
import management_codegym.repository.ManagementStudentAndTeacher;

public class StudentService implements IStudentService {

  private IStudentRepository iStudentRepository = new ManagementStudentAndTeacher();

  @Override
  public void showListStudent() {
    iStudentRepository.showListStudent();
  }

  @Override
  public void addStudent() {
    iStudentRepository.addStudent();
  }

  @Override
  public void deleteStudent() {
    iStudentRepository.deleteStudent();
  }
}
