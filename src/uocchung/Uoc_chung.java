package uocchung;

import java.util.Scanner;

public class Uoc_chung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = sc.nextInt();
        System.out.println("Nhap so b");
        b = sc.nextInt();

        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    System.out.println("Uoc chung lon nhat cua a va b = " + i);
                    break;
                }
            }
        }
    }
}
