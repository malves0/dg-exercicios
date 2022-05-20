package com.meli.crudspringjpa.controller;

import com.meli.crudspringjpa.model.Student;
import com.meli.crudspringjpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private IStudentService stuServ;

    // endpoint para criar novo aluno
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        stuServ.saveStudent(student);
        return "O aluno foi adicionado com sucesso";
    }

    // Endpoint para trazer todos os alunos
    @GetMapping("/students")
    public List<Student> getStudents() {
    // List<Student> studentList = stuServ.getStudents();
        return stuServ.getStudents();
    }

    // Endpoint para fazer alterações nos alunos

    public Student editStudent (@PathVariable long id,
                                @RequestParam("name") String newName,
                                @RequestParam("lastname") String newLastname) {
        Student stu = stuServ.findStudent(id);
        // isso pode ir no serviço
        stu.setLastname(newName);
        stu.setName(newLastname);
        stuServ.saveStudent(stu);
        return stu;
    }

    // Endpoint para deleter alunos
    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        stuServ.deleteStudent(id);
        return "O aluno foi excluído com sucesso";
    }


    }
