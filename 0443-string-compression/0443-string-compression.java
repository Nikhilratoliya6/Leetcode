
// class Solution {
//     public int compress(char[] chars) {
//         HashMap<Character, Integer> h=new HashMap <>(); 
//         for(int i=0;i<chars.length;i++){
//             h.put(chars[i], h.getOrDefault(chars[i],0)+1); 
//         }
//         int index=0;
//         for(var e: h.entrySet()){
//             chars[index++]=e.getKey();
//             if(e.getValue()>1){
//                 String str=String.valueOf(e.getValue());
//                 for(char c:str.toCharArray()){
//                     chars[index++]=c;
//                 }
//             }

//         }
//         return index;
       
//     }
// }
class Solution {
    public int compress(char[] chars) {
        int index = 0; // index to place the compressed result
        int i = 0; // index to traverse the input array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Place the current character in the result
            chars[index++] = currentChar;

            // Place the count in the result if more than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the length of the compressed string
    }
}
