package com.example.validation.controller;

import com.example.validation.model.inputdto;
import com.example.validation.model.outputdto;
import com.example.validation.service.implimentationclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller
{
    private implimentationclass servicesobject;
    @Autowired
    public controller(implimentationclass servicesobject)
    {
        this.servicesobject=servicesobject;
    }
 @PostMapping("/postdata")
    public String adddata(@Validated @RequestBody inputdto inputdtoobject)
   {
    servicesobject.adddata(inputdtoobject);
    return "added";
   }
   @GetMapping("/getdata")
    public List<outputdto> getdata()
   {
       return servicesobject.getdata();
   }

}
