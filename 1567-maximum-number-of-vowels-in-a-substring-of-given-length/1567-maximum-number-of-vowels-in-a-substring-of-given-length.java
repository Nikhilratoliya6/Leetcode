class Solution {
    public int maxVowels(String s, int k) {
    //     int n = s.length();
    //     if (n < k) return 0; 
        
    //     int count = 0;
    //     int maxCount = 0;

        
    //     for (int i = 0; i < k; i++) {
    //         if (isVowel(s.charAt(i))) {
    //             count++;
    //         }
    //     }
    //     maxCount = count;

    //     for (int i = k; i < n; i++) {
            
    //         if (isVowel(s.charAt(i - k))) {
    //             count--;
    //         }
           
    //         if (isVowel(s.charAt(i))) {
    //             count++;
    //         }
    //         maxCount = Math.max(maxCount, count);
    //     }

    //     return maxCount;
    // }

    // private boolean isVowel(char c) {
    //     return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    // }
    
    Set<Character> ch=new HashSet<>();
    ch.add('a');
    ch.add('e');
    ch.add('i');
    ch.add('o');
    ch.add('u');

    int windowvowels=0;
    int maxvowels=0;

    // vowels in my first window
    for(int i=0;i<k;i++){
        if(ch.contains(s.charAt(i))){
                    windowvowels++;


        }
    }
  maxvowels=windowvowels;

    for(int i=k;i<s.length();i++){
        if(ch.contains(s.charAt(i-k))){
         windowvowels--;
        }
        if(ch.contains(s.charAt(i))){
         windowvowels++;
        }
            maxvowels=Math.max(maxvowels,windowvowels);

    }
    return maxvowels;  

        
    


}
}
