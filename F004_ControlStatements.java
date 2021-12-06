package UploadToGithub;

import java.util.*;

public class F004_ControlStatements {
    
    public static void main(String[] args) {
//      if statement
        System.out.println("verbal: if 5 is smaller than 10, then print 'true', else print 'bro, u ok? 10 is greater than 5...' ");
        if (5 <= 10){
            System.out.println("\n5 <= 10 ?\nTRUE");
        } else {
            System.out.println("bro, u ok? 10 is greater than 5...");
        }
//      swicth statement
        System.out.println("\n\nverbal: Enter a number, if the number equals to 1 print 'one', else if the number equals to 2 print 'two', else print 'unknown'");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number|: ");
        int number = Integer.parseInt(read.nextLine());
        switch(number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("unknown number");
                break;
        }
    }
}
