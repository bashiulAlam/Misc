import java.util.ArrayList;

public class Main {

    static long xorSequence(long l, long r) {
        ArrayList<Long> xorVals = new ArrayList<Long>();
        xorVals.add((long) 0);
        for (int i = 1; i < r + 1; i++)
            xorVals.add(i ^ xorVals.get(i - 1));
        //long sum = 0;

        long temp = xorVals.get((int) l) ^ xorVals.get((int) (l + 1));
        for (int i = (int )(l + 2); i <= r; i++)
            temp = temp ^ xorVals.get(i);

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(xorSequence(2, 4));
        System.out.println(xorSequence(2, 8));
        System.out.println(xorSequence(5, 9));
        System.out.println(xorSequence(15, 20));
    }
}
