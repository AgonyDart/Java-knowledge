package UploadToGithub;

import java.util.*;

public class F002_BookPractice {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("What is the title of the book? |:");
        String title = String.valueOf(read.nextLine());
        System.out.print("What is the author of the book? |:");
        String author = String.valueOf(read.nextLine());
        System.out.print("What is the publisher of the book? |:");
        String publisher = String.valueOf(read.nextLine());
//      Printed by parts - - -
        System.out.println(" ");
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The publisher of the book is " + publisher);
//      Full printed - - -
        System.out.println(" ");
        System.out.println(title + " was written by " + author + " for the publisher " + publisher);
    }
}
