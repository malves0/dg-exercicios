package com.meli.crudspringjpa.service;

import com.meli.crudspringjpa.model.Student;
import com.meli.crudspringjpa.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    private final StudentRepository stuRepo;

    public StudentService(StudentRepository stuRepo) {
        this.stuRepo = stuRepo;
    }

    @Override
    @Transactional (readOnly = true)
    public List<Student> getStudents() {
//        List<Student> studentList = stuRepo.findAll();
        return stuRepo.findAll();
    }

    @Override
    @Transactional
    public void saveStudent(Student stu) {
        stuRepo.save(stu);
    }

    @Override
    public void deleteStudent(long id) {
        stuRepo.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Student findStudent(long id) {
        // Student stu = stuRepo.findById(id).orElse(null);
        // se o aluno nao for encontrado retorna null
        return stuRepo.findById(id).orElse(null);
    }
}
