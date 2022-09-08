package maxinarray;

public class Main {
    public static void main(String[] args) {
        double [] arr = new double[] {
              1.0, 7.5, 4.3, 1.5, 9.25
        };
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max);
            max = arr[i];
        }
        System.out.println("max = "+max);
    }
}
