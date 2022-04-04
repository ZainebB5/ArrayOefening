package be.intecbrussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//        int[] array = new int[25];
//        for(int i=0; i<array.length; i++){
//            array[i]= random.nextInt(150);
//            //System.out.println(array[i]);
//        }
        int[] array = {21,12,1,18,2,46,78,32};
        int n = array.length;
        int[]newArray = new int[n+1];
        //détermine la fin du tableau
        int nIndex= n-1;
        //int index  = 3;
        System.out.println(Arrays.toString(array));
        int positionIndex;
        do {
            System.out.println("Please enter de number of position between 0 and " + nIndex);
              positionIndex = input.nextInt();
        }while(positionIndex<0 || positionIndex > (n-1));

        System.out.println("Please enter de number to add");
        //int numberToAdd = 8;
        int numberToAdd = input.nextInt();;


        int index = 0;
        for(int i = 0; i<newArray.length;i++){
            if(i == positionIndex){
                newArray[i]= numberToAdd;
            }
            else{
                newArray[i]= array[index];
                index++;
            }
        }
        newArray[index]= numberToAdd;
        System.out.println(Arrays.toString(newArray));

    }
}
