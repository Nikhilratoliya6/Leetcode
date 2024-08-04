import java.util.*;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                arr.add(sum);
            }
        }
        
        Collections.sort(arr);
                long sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum += arr.get(i);
        }
        
        return (int) (sum % 1_000_000_007);
    }
}


