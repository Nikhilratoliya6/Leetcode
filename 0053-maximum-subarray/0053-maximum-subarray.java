// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum=0;
//         int maxi=0;
//         int maxsofar=0;
//         if(nums.length==1){
//                  return nums[0];  


//         }
//         for(int i=0;i<nums.length;i++){
//             sum=sum+nums[i];
            
//             maxi=Math.max(nums[i],sum);
//             maxsofar=Math.max(maxsofar,maxi);
          

//         }
//         return maxsofar;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}