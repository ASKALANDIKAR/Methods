
    //Write a method that takes two numbers as parameters and swaps them without returning anything. Call the method using the class name.
package com.jbk;

public class Practice5 {
    public static void main(String[] args)
    {
        Practice5.swap(12,21);

    }
    public static void swap(int a, int b){
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Now Swap the Values....");
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println("A = "+ a);
        System.out.println("B = "+ b);
    }
}
