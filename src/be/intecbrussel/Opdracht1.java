package be.intecbrussel;

import java.util.Random;

public class Opdracht1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];
        for(int i=0; i<array.length; i++){
            array[i]= random.nextInt(150);
            System.out.println(array[i]);
        }
        int smaller1 = array[0];
        int smaller2 = 10000000;
        for (int i = 0;i < array.length;i++){
            if (array[i] < smaller1){
                smaller2 = smaller1;
                smaller1 = array[i];
            }else if (array[i] < smaller2 && array[i] > smaller1){
                smaller2 = array[i];
            }
        }
        System.out.println("The smallest 1 is " + smaller1);
        System.out.println("The smallest 2 is " + smaller2);

    }
}
