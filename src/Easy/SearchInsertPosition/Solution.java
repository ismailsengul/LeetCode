package Easy.SearchInsertPosition;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 6};
        int target = 0;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (i > 0 && nums[i - 1] < target && nums[i] > target) {
                return i;
            }

        }
        return 0;
    }
}
