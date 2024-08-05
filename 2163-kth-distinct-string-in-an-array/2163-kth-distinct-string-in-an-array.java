import java.util.HashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> h = new HashMap<>();
        
        
        for (String num : arr) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
    
        for (String num : arr) {
            if (h.get(num) == 1) {
                k--;
                if (k == 0) {
                    return num;
                }
            }
        }
        return "";
    }
}
