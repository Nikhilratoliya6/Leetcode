class Solution {
    public String decodeString(String str) { 
       StringBuilder sb =new StringBuilder();
       StringBuilder sb2=new StringBuilder();
       StringBuilder kk=new StringBuilder();
       Stack<Character>st=new Stack<>();
       Stack<Character>st2=new Stack<>();
       st2.push(',');
       for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
        if(Character.isDigit(ch)){ 
          st2.push(ch);
        }
        else if(ch!=']'){
        if(ch=='[')
        st2.push(',');
        st.push(ch);
        }
        else if(ch==']'){
            while(!st.isEmpty()&&st.peek()!='['){
                sb.append(st.pop());
            }
            st.pop();
            sb.reverse();
            if(!st2.isEmpty()&&st2.peek()==',')
            st2.pop();
            while(!st2.isEmpty()&&st2.peek()!=','){
                kk.append(st2.pop());
            }
            kk.reverse();
            int k=Integer.parseInt(kk.toString());
            for(int j=1;j<=k;j++){
              sb2.append(sb);
            }
            for(int l=0;l<sb2.length();l++){
                 char ch2=sb2.charAt(l);
                 st.push(ch2);
            }
            kk=new StringBuilder();
            sb2=new StringBuilder();
            sb=new StringBuilder();
        }
       }
       sb =new StringBuilder();
       while(!st.isEmpty()){
         sb.append(st.pop());
       }
       sb.reverse();
       return sb.toString();
    }
}