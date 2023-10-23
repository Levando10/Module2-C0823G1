package management_codegym.service;

import management_codegym.repository.IStudentRepository;
import management_codegym.repository.ITeacherRepository;
import management_codegym.repository.ManagementStudentAndTeacher;

public class TeacherService implements ITeacherService {

  private ITeacherRepository iTeacherRepository = new ManagementStudentAndTeacher();

  @Override
  public void showListTeacher() {
    iTeacherRepository.showListTeacher();
  }

  @Override
  public void addTeacher() {
    iTeacherRepository.addTeacher();
  }

  @Override
  public void deleteTeacher() {
    iTeacherRepository.deleteTeacher();
  }
}
