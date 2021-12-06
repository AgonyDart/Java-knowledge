package UploadToGithub;

import java.util.*;

public class F009_2NewJavaObject {
    
    public static void main(String[] args) {
//      Declaration of a new object in the class 'Scanner' and the class we just made
        Scanner read = new Scanner(System.in);
        F009_1NewJavaClass person = new F009_1NewJavaClass();
//      Filling data
        System.out.print("Tell me your name|: ");
        person.name = String.valueOf(read.nextLine());
        System.out.print("Now your surname please|: ");
        person.surname = String.valueOf(read.nextLine());
        System.out.print("How old are you?|: ");
        person.age = Integer.parseInt(read.nextLine());
        System.out.print("What is your occupation?|: ");
        person.occupation = String.valueOf(read.nextLine());
//      Using the method created in the new java class to print the data
        person.PrintData();
    }
}
