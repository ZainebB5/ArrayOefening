package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int [][]array2D ={{1,2,5,3,8,4,6}, {13,3,2,5,1,2,4}};
        System.out.println("Please enter array 1 ");
        int positionIndex1 = scanner.nextInt();
        System.out.println("Please enter de first index");
        int positionIndex2 = scanner.nextInt();
        int [][]array2D = new int[positionIndex1][positionIndex2];

        //int positionIndex1 = scanner.nextInt();
        System.out.println("Please enter de first value to add");
        int numberToAdd1 = scanner.nextInt();
        System.out.println("Please enter de first index");

        System.out.println("Please enter de first value to add");
        int numberToAdd2 = scanner.nextInt();


        for (int i = 0; i < array2D.length; ++i) {
            for (int j = 0 ;i<array2D[i].length;j++){
                if(i == positionIndex1 && i == positionIndex2){
                    array2D[i][j] = numberToAdd1;
                    System.out.println(array2D[i][j]);

            }
        }
//            for(int j = 0; j < array2D[i].length; ++j) {
//                System.out.println(array2D[i][j]);
//            }
        }


    }
}
