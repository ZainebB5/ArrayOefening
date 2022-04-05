package be.intecbrussel.ArraysExtraOefeningen;

import java.util.SortedMap;

public class IntegerArrayManipulatie {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;
        int [] numbers2 =  {1,2,3,4,5,6,7,8,9,10};

        System.out.println("number index 0 is : " + numbers[0]);
        System.out.println("number index 5 is : " + numbers[5]);
        System.out.println("Print number index 0 -> 5 ");
        for (int i = 0; i < numbers.length; i++){
            if(i < 5 ){
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Replace divisible by 4 with  0 ");
        for (int i = 0; i < numbers.length; i++){
            if( (numbers[i]%4) == 0 ){
                numbers[i] = 0;
            }
            System.out.println(numbers[i]);
        }
        System.out.println("foreach print ");
        for (int number :numbers2) {
            System.out.println(number);
        }
        System.out.println("array reverse ");
        for ( int i = numbers2.length -1 ; i >=0 ; i--){
            System.out.println(numbers2[i]);
        }
        System.out.println("array reverse and x 13");
        for ( int i = numbers2.length -1 ; i >=0 ; i--){
            System.out.println(numbers2[i] *13);
        }

    }
}
