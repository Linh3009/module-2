package hienthiSNT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
                if (check) {
                    System.out.println(N);
                    count++;
                }
                N++;
            }
        }
    }

