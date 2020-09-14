import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = new int[] {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> first = new HashMap<Integer, Integer>();
        Map<Integer, Integer> second = new HashMap<Integer, Integer>();
        int[] result = new int[brr.length - arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!second.containsKey(arr[i]))
                second.put(arr[i], 1);
            else
                second.put(arr[i], second.get(arr[i]) + 1);
        }

        for (int i = 0; i < brr.length; i++) {
            if (!first.containsKey(brr[i]))
                first.put(brr[i], 1);
            else
                first.put(brr[i], first.get(brr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : first.entrySet()) {
            if (second.containsKey(entry.getKey()) && entry.getValue() - second.get(entry.getKey()) > 0) {
                for (int i = 0; i < entry.getValue() - second.get(entry.getKey()); i++) {
                    result[index] = entry.getKey();
                    index++;
                }
            } else if (!second.containsKey(entry.getKey())){
                for (int i = 0; i < entry.getValue(); i++) {
                    result[index] = entry.getKey();
                    index++;
                }
            }
        }

        return result;
    }
}
