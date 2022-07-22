package com.controlstatement;

public class SampleReturn1   
{  
    /* Method with an integer return type and no arguments */  
    public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
   
    public static void main(String ar[])   
    {  
        SampleReturn1 obj = new SampleReturn1();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
}  
