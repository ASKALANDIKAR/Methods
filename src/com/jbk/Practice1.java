
// Write a method that prints "Hello, World!" when called. Call the method using the class name.

package com.jbk;

public class Practice1 {
    public static void main (String[] args){
        Practice1.print();  // Called by using Class Name
        print();            // Called by Using Method Name

    }
    public static void print (){
        System.out.println("Hello World !");
    }

}
