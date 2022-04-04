package be.intecbrussel.Correctie;

import java.util.Arrays;

public class Opdracht_4 {
    public static void main(String[] args) {
        int [] array = new int []{7,3,8,-2,3,7,7,8,13,-2,7,99};
        boolean[] booleanArray = new boolean[array.length];
        Arrays.fill(booleanArray, true);
        int count = 0;
        for (int index = 0 ; index < array.length;index++) {
            //! wordt gebruikt om een boolean om te draaien (true wordt false, false wordt true)
            //om in de if blok te komen, moet booleanArr[index] false zijn , zodat die door de
            //uitroepteken true wordt. Een conditie moet true zijn om in de ifblock te komen
            if (!booleanArray[index]){
                continue;
            }
            for (int index2 = index + 1; index2 < array.length; index2++) {
                if(array[index] == array[index2]){
                    count++;
                    booleanArray[index2] = false;
                }
            }
            if (count > 1){
                System.out.println(count + " x " + array[index]);
            }
            count = 1;
        }
    }
}
