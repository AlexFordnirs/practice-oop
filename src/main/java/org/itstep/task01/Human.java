package org.itstep.task01;

import java.util.Date;

public class Human {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;
    public  Human()
    {

    }
    public  Human(String fullName, String dateOfBirth, String phone, String city, String country, String address)
    {
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.phone=phone;
        this.city=city;
        this.country=country;
        this.address=address;
    }
    void displayInfo(){
        System.out.printf("ФИО: %s \nдатa рождения: %d\n контактный телефон: %f \nгород: %g\n странa: %h \nдомашний адрес: %j\n", fullName, dateOfBirth,phone,city,country,address);
    }
    public String getFullName(){return fullName;}
    public void setFullName(String fullName){ this.fullName=fullName;}
    public String getDateOfBirth(){return dateOfBirth;}
    public void setDateOfBirth(String dateOfBirth){this.dateOfBirth=dateOfBirth;}
    public String getPhone(){return phone;}
    public void setPhone(String phone){  this.phone=phone;}
    public String getCity(){return city;}
    public void setCity(String city){  this.city=city;}
    public String getCountry(){return country;}
    public void setCountry(String country){ this.country=country;}
    public String getAddress(){return address;}
    public void setAddress(String address){ this.address=address;}
}
