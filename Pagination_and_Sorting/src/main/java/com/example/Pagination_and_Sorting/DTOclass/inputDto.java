package com.example.Pagination_and_Sorting.DTOclass;

import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
public class inputDto
{
    @Id
    private int id;
    private String name;
    private String brand;
    private long price;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public long getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(long price) {
        this.price = price;
    }


}
