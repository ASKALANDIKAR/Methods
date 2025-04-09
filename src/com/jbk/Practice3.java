
 // Write a method that takes an integer as a parameter and prints whether it is even or odd. Call the method using Object Name  .


package com.jbk;

public class Practice3 {

    public static void main(String[] args) {
        Practice3 num = new Practice3();  // creating object for non-static method
        num.check(5);                  // calling by object due to non-static method
    }

    //Using Non-static Method
    public void check(int a) {
        if (a%2==0) {
            System.out.println(a + ", Is Even Number");
        } else {
            System.out.println(a + ", Is Odd Number");
        }

    }
}
