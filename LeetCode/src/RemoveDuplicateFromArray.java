/**
 * Created by Sabab on 9/7/2020.
 */
public class RemoveDuplicateFromArray {
    public int removeDuplicates(int[] nums) {
        int removalCount = 0;
        int item = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == item)
                removalCount++;
            else
                item = nums[i];
        }

        return nums.length - removalCount;
    }
}
