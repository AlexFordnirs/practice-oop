package org.itstep.task03;

import org.itstep.task02.City;

public class Country {

    private String name;
    private String continent;
    private String code;
    private String capital;
    private String cities;
    private int inhabitants;
    private  City ct = new City();
   // private  City cities[]=new City[0];
    //private City[] city= new City[0];

    public  Country()
    {

    }
    public  Country(String name, String continent, String code, String capital,String cities)
    {
        this.name=name;
        this.continent=continent;
        this.code=code;
        this.capital=capital;
        this.cities=cities;
    }
    void displayInfo(){
        System.out.printf("ФИО: %s \nдатa рождения: %d\n контактный телефон: %f \nгород: %g\n странa: %h \nдомашний адрес: %j\n", name, continent,code,capital);
    }
    public String getName(){return name;}
    public void setName(String name){ this.name=name;}
    public String getContinent(){return continent;}
    public void setContinent(String continent){this.continent=continent;}
    public String getCode(){return code;}
    public void setCode(String code){  this.code=code;}
    public String getCapital(){return capital;}
 //   public void setCapital(String capital){  this.capital=capital;}
    public  int getInhabitants(){int result=0; for(String citys:ct.cities){result+=ct.getInhabitants();} return result;}
   // public City[] getCities(){return cities;}
    public String getCities(){return cities;}

    public  void addCity(City city)
    {
   String[] temp=new String[ct.cities.length+1];
   for(int i=0;i<ct.cities.length;i++)
   {
       temp[i]=ct.cities[i];
   }
temp[ct.cities.length]=city.cities[ct.cities.length];
    }
}

