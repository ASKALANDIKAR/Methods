
    //Write a method that takes an integer and prints its multiplication table up to 10. Call the method using the class name.

package com.jbk;

public class Practice4 {
    public static void main(String[] args)
    {
        Practice4.Table(12);

    }
    // Method is PARAMETERIZED-RETURN type
    public static int Table(int a) {
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            b = a * i;
            System.out.println(b);
        }
        return b;
    }
}
