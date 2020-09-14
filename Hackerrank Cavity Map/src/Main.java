public class Main {

    static String[] cavityMap(String[] grid) {
        if (grid.length > 2) {
            for (int i = 1; i <= grid.length - 2; i++) {
                for (int j = 1; j <= (grid.length - 2); j++) {
                    if (!String.valueOf(grid[i].charAt(i - 1)).equals("X")) {
                        int number  = Integer.parseInt(String.valueOf(grid[i].charAt(i)));
                        if (Integer.parseInt(String.valueOf(grid[i - 1].charAt(j))) < number
                                && Integer.parseInt(String.valueOf(grid[i].charAt(j - 1))) < number
                                && Integer.parseInt(String.valueOf(grid[i].charAt(j + 1))) < number
                                && Integer.parseInt(String.valueOf(grid[i + 1].charAt(j))) < number) {
                            grid[i] = grid[i].substring(0, i) + "X" + grid[i].substring(i + 1);
                        }
                    }
                }
            }
        }

        return grid;
    }

    public static void main(String[] args) {
        String[] str = new String[] {"1112",
                "1912",
                "1892",
                "1234"};
        //int ip = Integer.parseInt(String.valueOf(str[1].charAt(1)));
        int p = (int) Math.pow((str.length - 2), 2);
        System.out.println(p);
        str = cavityMap(str);
        for (int i = 0; i < str.length; i++)
            System.out.println(str[i]);
    }
}
