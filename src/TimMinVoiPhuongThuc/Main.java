package TimMinVoiPhuongThuc;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,-30,2,10,-5,-15,67};
        System.out.println("so nho nhat la " +minValue(arr));
    }
    public static int minValue(int[] arr) {
        int min = 0;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}


