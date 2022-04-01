package be.intecbrussel;

public class Opdracht4 {
    public static void main(String[] args) {
        int[] array = {1,11,15,12,1,8,7,2,11,17,49,12,1};
        int count = 0;
        for (int i = 0; i < array.length ; i++){
            for (int j= i+1 ; j < array.length; j++){
                if (array[i] == array[j]){
                    System.out.println(" x " +array[j]);
                }
            }

        }
    }
}
