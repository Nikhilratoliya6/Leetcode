class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = targetsum(nums, 0, 0, target);
        return n;
    }

    public static int targetsum(int[] nums, int idx, int sum, int target) {
        if (idx == nums.length) {
            return sum == target ? 1 : 0;
        }
        return targetsum(nums, idx + 1, sum + nums[idx], target) +
               targetsum(nums, idx + 1, sum - nums[idx], target);
    }
}
