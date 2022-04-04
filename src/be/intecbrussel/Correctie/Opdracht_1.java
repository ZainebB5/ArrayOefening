package be.intecbrussel.Correctie;

import java.util.Arrays;

public class Opdracht_1 {
    public static void main(String[] args) {
        int [] randomArray = new int []{7,3,8,2,3,7,7,8,13,2,7};
        int smaller1 = 999999999;
        int smaller2 = 999999999;
        System.out.println(Arrays.toString(new String[]{Arrays.toString(randomArray)}));
        for (int index = 0; index < randomArray.length; index++){
            // create element out array
            int arrayNumber = randomArray[index];
//            if(arrayNumber == smaller1){
//                continue;
//            }
            if (arrayNumber < smaller1){
                smaller2 = smaller1;
                smaller1 = arrayNumber;
            } else if(arrayNumber < smaller2 && arrayNumber > smaller1){
                smaller2 = arrayNumber;
            }
        }
        System.out.println("The smallest 1 is " + smaller1);
        System.out.println("The smallest 2 is " + smaller2);
    }
}
