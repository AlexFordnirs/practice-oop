package org.itstep.task07;

import org.itstep.task04.Fraction;

public class Chislo {
    private int numerator;
    private int denominator;
    private  boolean chislo;
    Chislo()
    {

    }
    Chislo(int numerator,int denominator,boolean chislo)
    {
        this.numerator=numerator;
        this.denominator=denominator;
        this.chislo=chislo;
    }



    public int getNumerator(){return numerator; }
    public void setNumerator(int numerator){this.numerator=numerator; }
    public int getDenominator(){return denominator; }
    public void setDenominator(int denominator){this.denominator=denominator; }
    public boolean getChislo(){return chislo; }
    public void setChislo(boolean chislo){this.chislo=chislo; }


    Chislo subtraction(Chislo f)
    {
        if(this.numerator -f.numerator==f.denominator)
        { return new Chislo((this.numerator/f.denominator),this.denominator/f.denominator,this.chislo);}
        else{
            return new Chislo((this.numerator -f.numerator),this.denominator= f.denominator,this.chislo);}
    }
    Chislo addition(Chislo f)
    {
        if(this.numerator +f.numerator==f.denominator)
        { return new Chislo((this.numerator),this.denominator/f.denominator,this.chislo);}
        else{
            return new Chislo((this.numerator +f.numerator),this.denominator= f.denominator,this.chislo);}
    }
    Chislo division(Chislo f)
    { if(this.denominator/this.denominator==1)
    { return new Chislo((this.numerator),this.denominator=f.numerator,this.chislo);}
    else{
        return new Chislo((this.numerator*f.numerator ),f.denominator/ this.denominator,this.chislo);}

    }
    Chislo multiplication(Chislo f)
    {
        return new Chislo((this.numerator * f.numerator),this.denominator* f.denominator,this.chislo);
    }
}
