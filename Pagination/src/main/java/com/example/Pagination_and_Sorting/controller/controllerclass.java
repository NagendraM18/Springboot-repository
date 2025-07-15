package com.example.Pagination_and_Sorting.controller;

import com.example.Pagination_and_Sorting.DTOclass.inputDto;
import com.example.Pagination_and_Sorting.DTOclass.outputdto;
import com.example.Pagination_and_Sorting.entity.mobile;
import com.example.Pagination_and_Sorting.service.implimentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllerclass
{
    private implimentation impli;
    @Autowired
    public controllerclass(implimentation impli)
    {
        this.impli=impli;
    }
    @PostMapping("/mobile")
    public ResponseEntity<String> addmobile(@RequestBody inputDto inputobject)
    {
        impli.adddata(inputobject);
        return ResponseEntity.ok()
                .body("add successfully");
    }
    @GetMapping("mobile")
    public ResponseEntity<List<outputdto>> getmobiledata()
    {
        List<outputdto> object =impli.getdata();
        return ResponseEntity.ok()
                .body(object);
    }

    @GetMapping("mobile/{page}/{size}/")
    public ResponseEntity<Page<outputdto>> getdatabypagination(@PathVariable int page, @PathVariable int size)
    {
        Page<outputdto>  object1=impli.getdatabypagination(page,size);
        return ResponseEntity.ok()
                .body(object1);
    }
    @DeletMapping("/delet")
    public ResponseEntity<String> deletthproduct(String priceoftheproduct)
    {
        impli.getdatabypagination(priceoftheproduct);
        return "deleted";

}
