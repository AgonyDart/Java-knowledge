package UploadToGithub;

import java.util.*;

public class F006_UnidimensionalArray {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("An array is a collection of 'varType'(int, String, etc.) indexed and easy access or modification\nEnter a Integer, this will be the length of the array|: ");
        int length = Integer.parseInt(read.nextLine());
        int array[] = new int[length];
        System.out.println("\nNow we will fill the array with a simple addition starting in 0: ");
        for (int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.print("[" + i + "] ");
        }
        System.out.println("\n\nWe can also modify a specific number indexed in the array, for example, we will change the number 3, in the index 3: ");
        array[3] = 111;
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");
        }
        System.out.print("\n\nPlease enter a number, this will be the index to the number to change, next enter the new number to change\nIndex|: ");
        int index = Integer.parseInt(read.nextLine());
        System.out.print("Number|: ");
        int number = Integer.parseInt(read.nextLine());
        if ((index >= 0) && (index <= array.length)){
            array[index] = number;
            System.out.print("re-printed: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
        } else  System.out.println("Enter a valid index");
    }
}
