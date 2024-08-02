// 
class Solution {
    public int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < k; ++i) {
            cnt += nums[i];
        }
        
        int mx = cnt;
        for (int i = k; i < n + k; ++i) {
            cnt += nums[i % n] - nums[(i - k + n) % n];
            // nums[i]=cnt+k;
            // mx=nums[i];
            mx = Math.max(mx, cnt);
        }

        // for(int i=n;i<0;i--){
        //     cnt+=nums[i%n]-nums[(i-k+n)%n]

        // }
        return k - mx;
    }
}