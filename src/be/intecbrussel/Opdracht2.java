package be.intecbrussel;

public class Opdracht2 {
    public static void main(String[] args) {
        int[] array = {21,12,1,18,2,46,78};
        int n = 1;
        for (int i = 0; i < n; i++){
            int j;
            int last = array[array.length-1];
            for ( j = array.length-1; j> 0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
