package org.example;

import java.util.Objects;
import java.util.*;

public class Phone implements Comparable<Phone>  {
    private static int idCounter = 1;
    int id;
    String vendor;
    String model;
    Double price;
    String color;


    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return id == phone.id &&
                Objects.equals(vendor, phone.vendor) &&
                Objects.equals(model, phone.model) &&
                Objects.equals(price, phone.price) &&
                Objects.equals(color, phone.color);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.vendor, this.model, this.price, this.color});
    }

    public Phone(String vendor, String model, Double price) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = null;
    }

    public Phone(String vendor, String model, Double price, String color) {
        this.id = idCounter++;
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = color;
    }



    public int getId() {
        return id;
    }

    public String getVendor() {
        return this.vendor;
    }


    public String getModel() {
        return this.model;
    }


    public Double getPrice() {
        return this.price;
    }


    public int compareTo(Phone other) {
        return this.model.compareTo(other.model); 
    }
}

