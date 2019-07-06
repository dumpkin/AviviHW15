package com.dumpkin.course;

public class Commodity implements Comparable<Commodity> {

    private String brand;
    private String TypeOfProduct;
    private String name;
    private String expireDate;


    public Commodity(String brand, String typeOfProduct, String name, String expireDate) {
        this.brand = brand;
        TypeOfProduct = typeOfProduct;
        this.name = name;
        this.expireDate = expireDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeOfProduct() {
        return TypeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        TypeOfProduct = typeOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return name + " Продукт компанії " + brand +
                ". Термін придатності: " + expireDate + ". тип продукту " + TypeOfProduct;
    }

    @Override
    public int compareTo(Commodity commodity) {
        return TypeOfProduct.compareTo(commodity.TypeOfProduct);
    }
}
