package com.example.image.controller;

import com.example.image.modelclass.StudentInputDTO;
import com.example.image.modelclass.StudentOutputDto;
import com.example.image.service.serviceclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/student")
public class controllerclass
{
    private serviceclass serviceclassobject;
    @Autowired
     public controllerclass(serviceclass serviceclassobject)
     {
         this.serviceclassobject=serviceclassobject;
     }
    @PostMapping("/adddata")
    public String adddata(@ModelAttribute StudentInputDTO studentinputobject,
                          @RequestPart MultipartFile file)
    {
        serviceclassobject.adddatatodatabase(studentinputobject,file);
        return "add successfully";
    }
    @GetMapping("/getdata")
    public List<StudentOutputDto> getdatafromdatabase()
    {
        return serviceclassobject.getdata();
    }
}