package prime.number;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("Khong phai SNT");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(number + " la SNT");
            } else {
                System.out.println(number + " khong la SNT");
            }
        }
    }
}
