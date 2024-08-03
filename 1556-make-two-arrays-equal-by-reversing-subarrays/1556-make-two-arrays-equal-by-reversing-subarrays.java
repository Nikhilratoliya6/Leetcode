class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(target);
      Arrays.sort(arr);
      
        boolean result=true;

        for(int i=0;i<target.length;i++){
            if(target[i]!=arr[i]){
                result=false;
            }
        }
        // HashSet<Integer> h=new HashSet<>();
        // for(int i=0;i<target.length;i++){
        //     h.add(target[i]);

        // }
        // for(int i=0;i<h.size();i++){
        //     // if(h.contains(arr[i])){
        //     //     result=true;
        //     // }
           
        //     if(!h.contains(arr[i])){
        //         return result=false;
        //     }
           

        
        return result;

        
    }
}