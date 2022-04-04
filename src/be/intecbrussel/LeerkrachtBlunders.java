package be.intecbrussel;

import java.util.Arrays;

public class LeerkrachtBlunders {
    public static void main(String[] args) {
        int [] studentPoints = {1,5,6,-9,77,110,-4,3,10,2};
        for (int value : studentPoints) {
            if (value > 10){
                value = value/11;
            }else if (value < 0){
                value = -value;
            }else if (value < 3){
                value = value *3;
            }
            System.out.println(value);
        }

    }
}
