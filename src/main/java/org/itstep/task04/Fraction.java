package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;
    //public int num1,  den1,  num2,  den2,  rnum,  rden;

    Fraction()
    {

    }
    Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator(){return numerator; }
    public void setNumerator(int numerator){this.numerator=numerator; }
    public int getDenominator(){return denominator; }
    public void setDenominator(int denominator){this.denominator=denominator; }


    Fraction subtraction(Fraction f)
    {
        if(this.numerator -f.numerator==f.denominator)
        { return new Fraction((this.numerator/f.denominator),this.denominator/f.denominator);}
        else{
            return new Fraction((this.numerator -f.numerator),this.denominator= f.denominator);}
    }
    Fraction addition(Fraction f)
    {
        if(this.numerator +f.numerator==f.denominator)
        { return new Fraction((this.numerator),this.denominator/f.denominator);}
        else{
        return new Fraction((this.numerator +f.numerator),this.denominator= f.denominator);}
    }
    Fraction division(Fraction f)
    { if(this.denominator/this.denominator==1)
    { return new Fraction((this.numerator),this.denominator=f.numerator);}
    else{
        return new Fraction((this.numerator*f.numerator ),f.denominator/ this.denominator);}

    }
    Fraction multiplication(Fraction f)
    {
        return new Fraction((this.numerator * f.numerator),this.denominator* f.denominator);
    }

}
