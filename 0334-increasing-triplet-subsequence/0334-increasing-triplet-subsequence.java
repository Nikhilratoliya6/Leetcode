class Solution {
    public boolean increasingTriplet(int[] nums) {
        // if(nums==null || nums.length<3){
        //     return false;

        // }
//         int a=Integer.MAX_VALUE;
//         int b=Integer.MAX_VALUE;
//   for(int num:nums){
//     if(num<=a){
//         a=num;

//     }
//     if(num<=b){
//         b=num;

//     }
//     else{
//         return true;
//     }
    
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
        if ( nums[i] <= first && nums[i] < second) {
            first = nums[i];
        }
        if ( nums[i] <= second && nums[i] > first) {
            second = nums[i];
        }
        if ( nums[i] > first && nums[i] > second ) {
            return true;
        }
    }
    return false;



    }

}
