package GopMang;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap so a1");
            int a1 = Integer.parseInt(sc.nextLine());
            arr1[i] = a1;
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Nhap so a2");
            int a2 = Integer.parseInt(sc.nextLine());
            arr2[j] = a2;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length +i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
        }
        System.out.println("Mang 1 la " + Arrays.toString(arr1));
        System.out.println("Mang 2 la " + Arrays.toString(arr2));
        System.out.println("Mang gop la " + Arrays.toString(arr3));
    }
}
