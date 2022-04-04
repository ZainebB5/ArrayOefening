package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int [][]array2D ={{1,2,5,3,8,4,6}, {13,3,2,5,1,2,4}};
        for (int i = 0; i < array2D.length; ++i) {
            for(int j = 0; j < array2D[i].length; ++j) {
                System.out.println(array2D[i][j]);
            }
        }


    }
}
