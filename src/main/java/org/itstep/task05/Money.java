package org.itstep.task05;


public class Money {
    private long hryvnia;
    private byte kopecks;
    Money()
    {}
    Money(long hryvnia)
    {
        this.hryvnia=hryvnia;
    }
    Money(long hryvnia,byte kopecks)
    {
        this.hryvnia=hryvnia;this.kopecks=kopecks;
    }



    public long getHryvnia(){return hryvnia; }
    public void setHryvnia(long hryvnia){this.hryvnia=hryvnia; }
    public byte getKopecks(){return kopecks; }
    public void setKopecks(byte kopecks){this.kopecks=kopecks; }
//

    //
    Money subtraction(Money m)
    { int result=this.kopecks-m.kopecks;

        return new Money((this.hryvnia -m.hryvnia),(byte)result);
    }
    Money addition(Money m)
    { int result=this.kopecks+m.kopecks;

        return new Money((this.hryvnia +m.hryvnia),(byte)result);
    }
    Money division(double r)
    {   long result=this.kopecks/(byte)r;
        return new Money((this.hryvnia /(long) r),(byte)result);
    }
    Money multiply(double r)
    { long result=this.kopecks*(byte)r;
        return new Money((this.hryvnia *(long)r),(byte) result);
    }
    /*Money equals(Money m)
    {   if(this.kopecks==m.kopecks)  {boolean t=true;return t;}
        else {boolean t=false;return new Money(97);}
    }*/
    boolean equals(Money m)
    {
        if(this.kopecks==m.kopecks)  {return true;}
        else {return false;}
    }
}

