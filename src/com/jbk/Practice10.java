
//  Write a method that takes an integer and prints its reverse(10 then its reverse 01). Call the method using the class name.

package com.jbk;

public class Practice10 {
    public static void main(String[] args){
        Practice10.reverse(12345);
    }
    public static void reverse(int n){
        System.out.print(n);
        int a=0;
        while(n != 0) {
            int digit = n%10;
            a=a*10+digit;
            n=n/10;
        }
        System.out.print(" Reversed Number: "+ a);
    }
}
