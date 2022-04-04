package be.intecbrussel;

public class Opdracht4 {
    public static void main(String[] args) {
        int[] array = {1,11,15,12,1,8,7,2,1,11,17,49,12,1,1};
        // werkt niet met negatieve waarden
        int[] count = new int[100];
        int i,temp;
        for (i = 0; i < array.length ; i++){
                temp = array[i];
                count[temp]++;
        }
        for (i=1 ;i < count.length;i++){
            if (count[i] > 1){
                System.out.println(count[i] + " x " + i);
            }
        }
    }
}
