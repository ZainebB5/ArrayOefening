package be.intecbrussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {21,12,1,18,2,46,78,32};
        int n = array.length;
        int nIndex= n-1;
        //int index  = 3;
        System.out.println(Arrays.toString(array));
        int index;
        do {
            System.out.println("Please enter de number of position between 0 and " + nIndex);
              index = input.nextInt();
        }while(index<0 || index > (n-1));

        System.out.println("Please enter de number to add");
        //int numberToAdd = 8;
        int numberToAdd = input.nextInt();;

        int[]newArray = new int[n+1];
        int j = 0;
        for(int i = 0; i<newArray.length;i++){
            if(i == index){
                newArray[i]= numberToAdd;
            }
            else{
                newArray[i]= array[j];
                j++;
            }
        }
        newArray[index]= numberToAdd;
        System.out.println(Arrays.toString(newArray));

    }
}
