package com.example.image.repository;

import com.example.image.modelclass.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentdatabase extends JpaRepository<student,Integer>
{

}
