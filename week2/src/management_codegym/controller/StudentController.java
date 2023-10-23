package management_codegym.controller;


import management_codegym.service.IStudentService;
import management_codegym.service.StudentService;

public class StudentController {
  private IStudentService iStudentService = new StudentService();
  public void showListStudent(){
    iStudentService.showListStudent();
  }
  public void addStudent(){
    iStudentService.addStudent();
  }
  public void deleteStudent(){
    iStudentService.deleteStudent();
  }

}
