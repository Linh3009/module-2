package interestRate;

import java.util.Scanner;

public class Laisuat {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        money = sc.nextDouble();
        System.out.println("Nhap so thang gui");
        month = sc.nextInt();
        System.out.println("Nhap lai suat");
        interestRate = sc.nextDouble();

        double result = money * (interestRate / 100) / 12 * month;
        System.out.println("Tien lai = " + result);
    }
}
