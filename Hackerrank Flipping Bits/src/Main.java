import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        long a = 26;
        long b = 29;
        //long max = (long) (Math.pow(2, 32) - 1);

        //System.out.println(a & b);

//        int[] scores = new int[] {100, 90, 90, 80, 75, 60};
        int[] scores = new int[] {100, 100, 50, 40, 40, 20, 10};
//        int[] alice = new int[] {50, 65, 77, 90, 102};
        int[] alice = new int[] {5, 25, 50, 120};

        int[] result = new int[alice.length];
        TreeMap<Integer, Integer> scoreMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for (int i = 0; i < scores.length; i++) {
            if (!scoreMap.containsKey(scores[i]))
                scoreMap.put(scores[i], 1);
            else
                scoreMap.put(scores[i], scoreMap.get(scores[i]) + 1);
        }

        for (int i = 0; i < alice.length; i++) {
            int flag = 0;
            int index = 1;
            for (Map.Entry<Integer, Integer> entry : scoreMap.entrySet()) {
                if (alice[i] >= entry.getKey()) {
//                    System.out.println("Matched value : " + entry.getValue());
                    flag = 1;
                    result[i] = index;
                    break;
                } else index++;
            }
            if (flag == 0)
                result[i] = scoreMap.size() + 1;
        }

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
