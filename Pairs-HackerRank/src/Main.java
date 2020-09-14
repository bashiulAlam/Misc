import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int pairs(int[] arr, int k) {
        int pairCount = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] - arr[j] == k) {
                    pairCount++;
                    break;
                }
            }
        }

        return pairCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            arr[i] = item;
        }

        System.out.println(pairs(arr, k));
    }
}
