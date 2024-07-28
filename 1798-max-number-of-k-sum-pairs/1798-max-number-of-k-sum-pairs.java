class Solution {
    public int maxOperations(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length/2-1;i++){
        //     for(int j=nums.length-1;j<nums.length/2;j--){

        //         if(nums[i]==k && nums[j]==k){ 
        //             count++;

        //         }
        //         if((nums[i]+nums[j])==k){
        //             count++;
        //       }
        //     }
        // }
        // return count;
        int ops=0;
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                ops++;
                i++;
                j--;

            }
            else if(nums[i]+nums[j]>k){
                j--;

            }
            else{
                i++;
            }
        }
        return ops;
        
    }
}