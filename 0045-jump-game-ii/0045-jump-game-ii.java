class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        dp[nums.length - 1] = 0; 
        
        for (int i = nums.length - 2; i >= 0; i--) {
            int steps = nums[i];
            int min = Integer.MAX_VALUE;
            
            for (int j = 1; j <= steps && i + j < nums.length; j++) {
                if (dp[i + j] < min) {
                    min = dp[i + j];
                }
            }
            
            if (min != Integer.MAX_VALUE) {
                dp[i] = min + 1;
            } else {
                dp[i] = Integer.MAX_VALUE;
            }
        }
        
        return dp[0];
    }
}
