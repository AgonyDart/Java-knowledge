package UploadToGithub;

import java.util.*;

public class F005_Loops {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); 
//      while loop
        System.out.print("The while loop will execute the code block only if the condition inside the while is true, when it doesn't, the loop break down\nverbal: Enter a number, the loop will add 1 from 0, until reach the number entered\nEnter a number|: ");
        int number = Integer.parseInt(read.nextLine());
        int addition = 0;
        while (addition <= number){
            System.out.println("actual value of 'addition' = " + addition);
            addition++;
        }
        addition = 50;
//      do while loop
        System.out.print("\n\nThe do-while loop will execute the code block at least one time, even if the condition is false, then it works like a normal while loop\nverbal: Enter a number, the loop will add 1 from 50, until reach the number entered\nEnter a number|:");
        int breaker = Integer.parseInt(read.nextLine());
        do {
            System.out.println("actual value of 'addition' = " + addition);
            addition++;
        } while (addition <= breaker);
//      for loop
        System.out.print("\n\nThe for loop is special, because you use it when you know how many 'iterations' you need to solve the problem\nverbal: Enter a number, this number will be multiplicated from 1 to 10\nEnter a number|: ");
        int multiplied = Integer.parseInt(read.nextLine());
        for (int i = 0; i <= 10; i++){
            System.out.println(multiplied + " x " + i + " = " + (multiplied * i));
        }
    }
}
