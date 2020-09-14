/**
 * Created by Sabab on 9/7/2020.
 */
public class Sum {
    public int[] sumOfTwoNum() {
        //int[] nums = new int[]{2, 7, 11, 15};
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
//        int target = 9;

        //Arrays.sort(nums);
        int[] res = new int[2];
        int flag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("loop i : " + i);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("loop j : " + j);
                if (nums[i] + nums[j] == target) {
                    flag = 1;
                    System.out.println("inserting i : " + i);
                    res[0] = i;
                    System.out.println("inserting j : " + j);
                    res[1] = j;
                    break;
                }
            }

            if (flag == 1)
                break;
        }

        System.out.println("[" + res[0] + ", " + res[1] + "]");
        return res;
    }
}
