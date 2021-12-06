package UploadToGithub;

import java.util.*;

public class F007_BidimensionalArray {
    
    public static void main(String[] args) {
        System.out.println("The bi-dimensional array is a collection of 'varType'(int, String, etc.) indexed and easy access or modification, but in two directions, visually known as a matrix\nFor example, a number pad will be printed: ");
        int matrix[][] = new int [3][3];
        int addition = 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = addition;
                System.out.print("[" + addition + "]");
                addition++;
            }
            System.out.println("");
        }
        System.out.println("\nModify an indexed data, for example the number 5 in i = 1, j = 1 to 456");
        matrix[1][1] = 456;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print("[" + matrix[i][j] + "]\t");
            }
            System.out.println("\n");
        }
        System.out.println("But also, make an irregular matrix");
        int length = 3, irregularLength = 1;
        int matrixI[][] = new int[length][];
        for (int i = 0; i < matrixI.length; i++){
            matrixI[i] = new int[irregularLength];
            irregularLength++;
        }
        for (int i = 0; i < matrixI.length; i++){
            int number = 1;
            for (int j = 0; j < matrixI[i].length; j++){
                matrixI[i][j] = number;
                System.out.print("[" + matrixI[i][j] + "]");
                number++;
            }
            System.out.println("");
        }
    }
}
