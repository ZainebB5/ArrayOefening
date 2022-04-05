package be.intecbrussel.ArraysExtraOefeningen;

import java.util.Arrays;

public class Temperatuur {
    public static void main(String[] args) {
        int [] temperatures = {6,3,1,-1,-3,0,-1};
        int sum = 0;
        for (int i = 0; i < temperatures.length; i++){
            sum += temperatures[i];

        }
        //float moyenne = (float) sum/ 7;
        float moyenne = (float) sum/ temperatures.length;
        System.out.printf("the average temperature is: %.2f" , moyenne);
        System.out.printf("\n negative temperatures");
        for (int temperature : temperatures) {
            if(temperature < 0){
                System.out.println(temperature);
            }
        }
        System.out.println("Change the temperature on the 6th day");
        for (int i = 0 ; i < temperatures.length; i++){
            temperatures[5] = -2;
        }
        System.out.println(Arrays.toString(temperatures));

    }
}
