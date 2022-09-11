package pushinarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {
                4,8,6,7,9,10
        };
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap index");
        index = sc.nextInt();

        int X;
        System.out.println("Nhap X");
        X = sc.nextInt();

        int [] arr2 = new int[arr.length + 1];
        if (index < 0 && index >= arr.length - 1) {
            System.out.println("Khong hop le");
        } else {
            for (int i = 0; i < arr2.length ; i++) {
                if (i < index){
                    arr2[i] = arr[i];
                } else if (i == index) {
                    arr2[i] = X;
                } else {
                    arr2[i] = arr[i - 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        }
    }

