package daonguocmang;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 20, 5, 15, 9, -22, 40};
        int a = 0;
        int b = array.length - 1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (a < b) {
                temp = array[a];
                array[a] = array[b];
                array[b]= temp;
                a++;
                b--;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
