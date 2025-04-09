
//   Write a method that takes an integer as a parameter and prints whether it is positive, negative, or zero. Call the method using the class name.
package com.jbk;

public class Practice7 {
    public static void main(String[] args){
        Practice7.check(-1);
    }
    public static void check(int n){
        if(n==0){
            System.out.println("The give Number is ZERO ");
        } else if (n>0) {
            System.out.println("The given Number is POSITIVE ");

        }
        else {
            System.out.println("The given Number is NEGATIVE");
        }
    }
}
