package com.sda.dorinagheorghe.startup.service.dto;

import com.sda.dorinagheorghe.startup.model.car.CarType;

import java.util.Date;

public class CarDTO {

    private Long id;
    private String Brand;
    private String model;
    private Date productDate;
    private String hp;
    private CarType carType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", productDate=" + productDate +
                ", hp='" + hp + '\'' +
                ", carType=" + carType +
                '}';
    }
}
