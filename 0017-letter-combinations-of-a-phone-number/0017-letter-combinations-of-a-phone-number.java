import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) {
            return new ArrayList<>();  
        }

        char ch = digits.charAt(0);
        String ros = digits.substring(1);

        List<String> rres = letterCombinations(ros);  
        List<String> mres = new ArrayList<>();

        int index = ch - '2';  
        String codeForCh = str[index];

        for (int i = 0; i < codeForCh.length(); i++) {
            char chcode = codeForCh.charAt(i);
            if (rres.isEmpty()) {
                mres.add("" + chcode);  
            } else {
                for (String rstr : rres) {
                    mres.add(chcode + rstr);
                }
            }
        }
        return mres;
    }

    
}
