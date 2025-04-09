package com.jbk;

public class Demo {
    public static void main (String[] args)
    {
        myAdd();
        mySub(50, 25);
        System.out.println("Multiplication "+  myMulti()) ;
        System.out.println("Division "+ myDiv(125,5));
    }
    // 1. NORMAL METHOD
    public static void myAdd(){
        int a=10, b=15;
        int c=a+b;
        System.out.println("Addition " + c);

    }

    //2. PARAMETERIZED METHOD
    public static void mySub(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction " + c);

    }

    //3. NORMAL-RETURN TYPE METHOD
    public static int myMulti(){
        int a= 5, b=5;
        int c = a*b;
        return c ;

    }

    //4. PARAMETERIZED-RETURN TYPE METHOD
    public static int myDiv(int a, int b ){
        int c = a/b;
        return c;

    }
}
