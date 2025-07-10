package com.example.validation.service;

import ch.qos.logback.core.model.Model;
import com.example.validation.model.inputdto;
import com.example.validation.model.outputdto;
import com.example.validation.model.validation;
import com.example.validation.repo.database;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class implimentationclass
{
    private ModelMapper modelobject;
    private database databseobject;
    public implimentationclass(ModelMapper modelobject,database databseobject)
    {
        this.modelobject=modelobject;
        this.databseobject=databseobject;
    }

    public void adddata(inputdto inputdtoobject)
    {
        validation valid=modelobject.map(inputdtoobject,validation.class);
        databseobject.save(valid);
    }

    public List<outputdto> getdata()
    {
        List<validation> valid=databseobject.findAll();
        List<outputdto> output=valid.stream()
                .map(object->modelobject.map(object, outputdto.class))
                .collect(Collectors.toList());
         return output;
    }
}
