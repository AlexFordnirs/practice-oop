package org.itstep.task02;

public class City {

    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;
    //private String capital;
    //
    //private  String capital;
    public City cities[] = new City[10];
    //
    public  City()
    {

    }
    public  City(String name, String region, String country, int inhabitants, String index, String code)
   //public  City(String name, String region, String country, int inhabitants, String index, String code)
    {
        this.name=name;
        this.region=region;
        this.country=country;
        this.inhabitants=inhabitants;
        this.index=index;
        this.code=code;
      //  this.capital=capital;
    }
    void displayInfo(){
        System.out.printf("ФИО: %s \nдатa рождения: %d\n контактный телефон: %f \nгород: %g\n странa: %h \nдомашний адрес: %j\n", name, region,country,inhabitants,index,code);
    }
    public String getName(){return name;}
    public void setName(String name){ this.name=name;}
    public String getRegion(){return region;}
    public void setRegion(String region){this.region=region;}
    public String getCountry(){return country;}
    public void setCountry(String country){  this.country=country;}
    public int getInhabitants(){return inhabitants;}
    public void setInhabitants(int inhabitants){  this.inhabitants=inhabitants;}
    public String getIndex(){return index;}
    public void setIndex(String index){ this.index=index;}
    public String getCode(){return code;}
    public void setCode(String code){ this.code=code;}
    //
   // public  String getCapital(){return capital;}
  //  public  void setCapital(String capital){  this.capital=capital;}

  /*  class Capital
    {
       // private String capital;
        public  String getCapital(){return capital;}
        public  void setCapital(String capital){  this.capital=capital;}
    }*/
}

