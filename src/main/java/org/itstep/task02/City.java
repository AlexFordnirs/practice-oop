package org.itstep.task02;

public class City {

    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;
    public  City()
    {

    }
    public  City(String name, String region, String country, int inhabitants, String index, String code)
    {
        this.name=name;
        this.region=region;
        this.country=country;
        this.inhabitants=inhabitants;
        this.index=index;
        this.code=code;
    }
    void displayInfo(){
        System.out.printf("ФИО: %s \nдатa рождения: %d\n контактный телефон: %f \nгород: %g\n странa: %h \nдомашний адрес: %j\n", name, region,country,inhabitants,index,code);
    }
    public String getFullName(){return name;}
    public void setFullName(String name){ this.name=name;}
    public String getDateOfBirth(){return region;}
    public void setDateOfBirth(String region){this.region=region;}
    public String getPhone(){return country;}
    public void setPhone(String country){  this.country=country;}
    public int getCity(){return inhabitants;}
    public void setCity(int inhabitants){  this.inhabitants=inhabitants;}
    public String getCountry(){return index;}
    public void setCountry(String index){ this.index=index;}
    public String getAddress(){return code;}
    public void setAddress(String code){ this.code=code;}

}
