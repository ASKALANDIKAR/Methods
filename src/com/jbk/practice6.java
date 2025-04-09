
//  Write a method that takes an integer N and prints numbers from 1 to N. Call the method using the class name.

package com.jbk;

public class practice6 {
    public static void main(String[] args){
        practice6.run(5);
    }
    public static void run(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}

