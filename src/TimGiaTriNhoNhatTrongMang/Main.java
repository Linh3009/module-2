package TimGiaTriNhoNhatTrongMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap so vao mang");
            int a = sc.nextInt();
            arr[i] = a;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang = " + min);
    }
}
