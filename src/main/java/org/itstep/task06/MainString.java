package org.itstep.task06;

import java.util.regex.Pattern;

public class MainString {

    private char[] chars = new char[1];
    private int len;

    public MainString()
    {char[] chars = new char[0];}
    public MainString(String chars)
    {
        this.chars = chars.toCharArray();
        len = this.chars.length;
    }
    public MainString(char chars, int len)
    {
        this.chars[0] = chars;
        this.len = len;
    }
    public MainString(char[] chars, int len)
    {
        this.chars = chars;
        this.len = len;
    }


    public int length() {
        return len;
    }
    public void clean()
    {
        chars = null;
        len = 0;
    }
    public MainString concat(MainString cconds)
    {
        char[] result = new char[this.length() + cconds.length()];
        int i =0;
        for (char chaSimvol: this.chars)
        { result[i] = chaSimvol;i++; }
        for (char chaSimvol: cconds.chars)
        { result[i] = chaSimvol;i++; }

        return new MainString(result, result.length);
    }
    public int indexOf(int cconds)
    {
        int i = 0;
        for (char letter:
                chars)
        {
            if(letter == cconds)
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String toString ()
    { CharSequence cs=chars.toString();return  cs.toString(); }

}
