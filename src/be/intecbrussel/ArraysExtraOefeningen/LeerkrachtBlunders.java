package be.intecbrussel.ArraysExtraOefeningen;

import java.util.Arrays;

public class LeerkrachtBlunders {
    public static void main(String[] args) {
        int [] studentPoints = {1,5,6,-9,77,110,-4,3,10,2};
        for (int i = 0 ; i< studentPoints.length; i++){
            if (studentPoints[i] > 10){
                studentPoints[i] = studentPoints[i]/11;
            }else if (studentPoints[i] < 0){
                studentPoints[i] = -studentPoints[i];
            }else if (studentPoints[i] < 3){
                studentPoints[i] = studentPoints[i] * 3;
            }
        }
        System.out.println(Arrays.toString(studentPoints));
    }
}
