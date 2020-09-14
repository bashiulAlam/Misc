public class Main {

    static long sumXor(long n) {
        int count = 0;
        for (long i = 0; i <= n; i++) {
            if (n + i == n ^ i)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
