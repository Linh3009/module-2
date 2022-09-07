package SNTduoi100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so"); // Nhap 100
        numbers = sc.nextInt();
        for (int i = 2; i <= numbers ; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
                if (check == true) {
                    System.out.println(i+" la SNT");

            }
        }
    }
}
