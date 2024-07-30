// class Solution {
//     public int longestSubarray(int[] nums) {
//         int zerocount=0;
//         int start=nums[0];
//         int end=nums[0];
//         int countones=0;
//         for(int i=start;i<nums.length;i++){
//             if(nums[i]==1){
//                 countones++;
//             }
//         }
//         int maxi=countones;
//         for(i=end;i<nums.length;i++){
//             if(nums[i]==0){
//                 countones++;
                
//             }
//             if(nums[i-nums.length]==0){
//                 countones--;
//                 nums[i-k]=1;
//             }
//             maxi=Math.max(maxi,countones)
//         }

        
//     }
// }



class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int start = 0;
        
        for (int i = 0; i < nums.length; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);
                          
            
            while (zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }
              
            longestWindow = Math.max(longestWindow, i - start);
            // mainarray=Math.max(longestwindow,minarray);
        }

        return longestWindow;
    }
}