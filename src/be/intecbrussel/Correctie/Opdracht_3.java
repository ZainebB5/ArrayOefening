package be.intecbrussel.Correctie;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Opdracht_3 {
    public static void main(String[] args) {
        int [] randomArray = new int []{7,3,8,2,3,7,7,8,13,2,7,99};
        int[]newArray = new int[randomArray.length +1];
        int valiueToAdd = 40;
        int positionToAdd = 5;
        System.out.println(Arrays.toString(randomArray)+"\n");
        for (int index =0; index < newArray.length ; index++){
            if (index < positionToAdd){
                newArray[index] = randomArray[index];
            }else if (index == positionToAdd){
                newArray[index] = valiueToAdd;
            }else{
                newArray[index]  = randomArray[index-1];
            }

        }
        System.out.println(Arrays.toString(newArray));




    }
}
