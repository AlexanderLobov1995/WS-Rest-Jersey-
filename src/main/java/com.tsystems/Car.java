package com.tsystems;

import java.util.Random;

/**
 * Created by Haigus on 10.11.2016.
 */
public class Car {

    public Car() {
    }

    public Car(String model) {
        this.model = model;
        price = new Random().nextInt(1000000);
        horsePowers = new Random().nextInt(500);
    }

    private String model;
    private int price;
    private int horsePowers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", horsePowers=" + horsePowers +
                '}';
    }
}
