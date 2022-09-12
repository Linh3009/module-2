package MaxTrongMang2Chieu;

public class Main {
    public static void main(String[] args) {
        double[][] arr = {{1, 2, 3}, {4, 5, 6}};
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
    }
}
