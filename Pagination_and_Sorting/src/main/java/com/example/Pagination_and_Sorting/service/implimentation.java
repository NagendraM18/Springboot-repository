package com.example.Pagination_and_Sorting.service;

import com.example.Pagination_and_Sorting.DTOclass.inputDto;
import com.example.Pagination_and_Sorting.DTOclass.outputdto;
import com.example.Pagination_and_Sorting.entity.mobile;
import com.example.Pagination_and_Sorting.repository.mobileinterface;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class implimentation
{
     private mobileinterface mob;
     private ModelMapper modelobject;
     private mobile entityobject;
     public implimentation(mobileinterface mob,ModelMapper model,mobile entityobject)
     {
         this.mob=mob;
         this.modelobject=model;
         this.entityobject=entityobject;
     }
    public void adddata(inputDto inputobject)
    {
       entityobject=modelobject.map(inputobject, mobile.class);
       mob.save(entityobject);
    }

    public List<outputdto> getdata()
    {
        List<mobile> entityobject=mob.findAll();
        List<outputdto> outputobject=entityobject.stream()
                .map(mobiledata->modelobject.map(mobiledata, outputdto.class))
                .collect(Collectors.toList());
        return outputobject;




    }

    public Page<outputdto> getdatabypagination(int page, int size)
    {

        Page<mobile> listofmobileobject= mob.findAll(PageRequest.of(page,size));
        Page<outputdto> pageobjectofoutputobj=listofmobileobject
                .map(object->modelobject.map(object, outputdto.class));


        return pageobjectofoutputobj;

    }

    public Page<outputdto> getobjectbysorting(int page, int size, String field)
    {
        Page<mobile> sorting=mob.findAll(PageRequest.of(page,size,Sort.by(Sort.Direction.ASC,field)));
        Page<outputdto> objectofsorting=sorting.map(object->modelobject.map(object,outputdto.class));
        return objectofsorting;
    }
}
