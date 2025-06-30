package com.example.image.service;

import com.example.image.modelclass.StudentInputDTO;
import com.example.image.modelclass.StudentOutputDto;
import com.example.image.modelclass.student;
import com.example.image.repository.studentdatabase;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class serviceclass {

    private studentdatabase studentdatabaseobject;
    private ModelMapper modelmap;

    @Autowired
    public void setterserviceclass(studentdatabase studentdatabaseobject, ModelMapper modelmap) {
        this.studentdatabaseobject = studentdatabaseobject;
        this.modelmap = modelmap;
    }


    public void adddatatodatabase(StudentInputDTO studentinputobject,MultipartFile file) {
        student studententityobject = new student();
        try{
            studentinputobject.setImagename(file.getOriginalFilename());
            studentinputobject.setImage(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        studententityobject = modelmap.map(studentinputobject, student.class);
        studentdatabaseobject.save(studententityobject);

    }

    public List<StudentOutputDto> getdata() {
        List<student> obj = studentdatabaseobject.findAll();

        StudentOutputDto dto = new StudentOutputDto();
        List<StudentOutputDto> objects = obj.stream()
                .map(student -> modelmap.map(student, StudentOutputDto.class))
                .collect(Collectors.toList());
        return objects;
    }
}
