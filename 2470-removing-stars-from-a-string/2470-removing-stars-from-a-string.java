class Solution {
    public String removeStars(String s) {
        String str="";
        String str2="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&& !st.empty()){
                st.pop();
                
            }
            if(s.charAt(i)!='*'){ 
                st.push(s.charAt(i));
            }
            
        }
        final int n=st.size();
        for(int i=0;i<n;i++){
            str+=String.valueOf(st.pop());
        }
        for(int i=str.length()-1;i>=0;i--){
           str2+=str.charAt(i);
        }
        return str2;
        
    }
}