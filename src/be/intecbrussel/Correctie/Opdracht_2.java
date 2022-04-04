package be.intecbrussel.Correctie;

import java.util.Arrays;

public class Opdracht_2 {
    public static void main(String[] args) {
        int [] randomArray = new int []{7,3,8,2,3,7,7,8,13,2,7};
        System.out.printf(Arrays.toString(randomArray)+"\n");
        int totalAmountOfElement = randomArray.length;
        int lastArrayValue = randomArray[totalAmountOfElement - 1];
        for (int index = totalAmountOfElement-1; index > 0 ; index--){
            randomArray[index] = randomArray[index-1];
        }
        randomArray[0] = lastArrayValue;
        System.out.printf(Arrays.toString(randomArray));
    }
}


