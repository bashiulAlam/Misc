/**
 * Created by Sabab on 9/7/2020.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int position = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                position = i;
        }

        if (position < 0) {
            for (int i = 0; i < nums.length; i++) {
                if (target < nums[i]) {
                    position = i;
                    break;
                }
            }
            if (position < 0)
                position = nums.length;
        }

        return position;
    }
}
