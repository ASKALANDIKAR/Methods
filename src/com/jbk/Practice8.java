
//  Write a method that takes an integer N and prints natural numbers from N to 1. Call the method using the class name.

package com.jbk;

public class Practice8 {
    public static void main(String[] args){
        Practice8.print(5);
    }
    public static void print(int n){
        for(int i=n; i>=1;i--){
            System.out.println(i);
        }
    }
}
