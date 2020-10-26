package org.itstep.task03;

import org.itstep.task02.City;

public class Country {

    private String name;
    private String continent;
    private String code;
    private City capital;
    private int inhabitants;
    private  City cities[]=new City[0];


    public  Country()
    {

    }
    public  Country(String name, String continent, String code, City capital)
    {
        this.name=name;
        this.continent=continent;
        this.code=code;
        this.capital=capital;
    }
    void displayInfo(){
        System.out.printf("ФИО: %s \nдатa рождения: %d\n контактный телефон: %f \nгород: %g\n странa: %h \nдомашний адрес: %j\n", name, continent,code,capital,inhabitants);
    }
    public String getName(){return name;}
    public void setName(String name){ this.name=name;}
    public String getContinent(){return continent;}
    public void setContinent(String continent){this.continent=continent;}
    public String getCode(){return code;}
    public void setCode(String code){  this.code=code;}



    public City[] getCities(){return cities;}
    //
    public  City getCapital(){return capital;}
    public  void setCapital(City capital){  this.capital=capital;}
    //
    public  void addCity(City city)
    {
   City[] citymp=new City[cities.length+1];
   for(int i=0;i<cities.length;i++)
   {
       citymp[i]=cities[i];
   }
        citymp[cities.length]=city;
    cities=citymp;
    }
    public  int getInhabitants(){
        int result=0; for(City city:cities){result+=city.getInhabitants();}
        return result;}
    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}

