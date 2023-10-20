package ss8_mvc.controller;

import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public void showList(){
        iStudentService.showList();
    }
    public void addStudent(){
        iStudentService.addStudent();
    }
    public void deleteStudent(){
        iStudentService.deleteStudent();
    }
    public void editStudent(){
        iStudentService.editStudent();
    }
}
