package ss8_mvc.service;

import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void showList() {
        iStudentRepository.showList();
    }

    @Override
    public void addStudent() {
        iStudentRepository.addStudent();
    }

    @Override
    public void deleteStudent() {
iStudentRepository.deleteStudent();
    }

    @Override
    public void editStudent() {
        iStudentRepository.editStudent();
    }
}
