package com.example.lenovo.finalgp_test1;

/**
 * Created by LENOVO on 2018-03-06.
 */

public class CarClass {
    private int car_id, rent_price;
    private String car_model;

    public CarClass(){

    }
    public CarClass(int car_id, int rent_price, String car_model) {
        this.car_id = car_id;
        this.rent_price = rent_price;
        this.car_model = car_model;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getRent_price() {
        return rent_price;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }
}
