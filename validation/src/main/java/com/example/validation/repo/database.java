package com.example.validation.repo;

import com.example.validation.model.validation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface database extends JpaRepository<validation,Integer>
{

}
