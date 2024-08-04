class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>h=new HashMap<>();
        boolean result=true;
       
        for(int e:arr){
            if(h.containsKey(e)){
              
            h.put(e,h.get(e)+1);

            }
            else{
                h.put(e,1);
            }
        }
    
    for(int i=0;i<arr.length-1;i++){
       for(int j=i+1;j<arr.length;j++){
       if (arr[i] != arr[j] && h.get(arr[i]).equals(h.get(arr[j]))) {
           return  result=false;
        }
       }
    }
    return result;
    }
}