package management_codegym.controller;

import management_codegym.service.ITeacherService;
import management_codegym.service.TeacherService;


public class TeacherController {
  private ITeacherService iStudentService = new TeacherService();
  public void showListStudent(){
    iStudentService.showListTeacher();
  }
  public void addStudent(){
    iStudentService.showListTeacher();
  }
  public void deleteStudent(){
    iStudentService.deleteTeacher();
  }
}
