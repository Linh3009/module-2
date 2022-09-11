package XoaPhanTuKhoiMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {
                4,8,6,7,9,10
        };
        int X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu muon xoa");
        X = sc.nextInt();

        int [] arrNew = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != X) {
                arrNew[j] = arr[i];
                j++ ;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
