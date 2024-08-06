class Solution {
    public int getMaximumConsecutive(int[] coins) {
    //  HashMap<Integer,Integer>h=new HashMap<>();
    //  ArrayList<Integer>arr=new ArrayList<>();
    //  HashSet<integer>hashsets=new HashSet<>();
    //  for(int num:coins){
    //     h.put(num,h.getOrDefault(num,0)+1);

    //  }
    // arr.add(0);
    // int maxsum=Integer.MAX_VALUE;
    //  for(int i=1;i<coins.length-1;i++){
    //  arr.add(coins[i][i+1]);
    //  maxsum=(maxsum,sum);

    //  }
   int ans=1;
   Arrays.sort(coins);
   for(int num:coins){
    if(num>ans){
        return ans;

    }
    else{
        ans+=num;;
    }
   }
     return ans;
    }
}     
