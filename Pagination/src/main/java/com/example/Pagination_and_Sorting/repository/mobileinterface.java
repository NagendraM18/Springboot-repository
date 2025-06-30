package com.example.Pagination_and_Sorting.repository;

import com.example.Pagination_and_Sorting.entity.mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mobileinterface extends JpaRepository<mobile,Integer>
{

}
