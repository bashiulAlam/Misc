import java.util.ArrayList;

public class Main {

    static ArrayList<Long> powerOfTwo(long n) {
        ArrayList<Long> powers = new ArrayList<Long>();
        powers.add((long) 2);

        while (powers.get(powers.size() - 1) <= n) {
            powers.add(powers.get(powers.size() - 1) * 2);
        }

        return powers;
    }

    static String counterGame(long n) {
        if (n == 1)
            return "Richard";
        else {
            ArrayList<Long> powers = powerOfTwo(n);
            int counter = 1;
            while (n != 1) {
                if (powers.contains(n)) {
                    n /= 2;
                    counter++;
                } else {
                    for (int i = powers.size() - 1; i >= 0; i--) {
                        if (powers.get(i) < n) {
                            n -= powers.get(i);
                            counter++;
                            break;
                        }
                    }
                }
            }
            if (counter % 2 == 0)
                return "Louise";
            else return "Richard";
        }
    }

    public static void main(String[] args) {
        System.out.println(counterGame((long) 6));
    }
}
