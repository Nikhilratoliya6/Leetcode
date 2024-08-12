class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        // DP array to store the number of ways to decode each substring
        int[] dp = new int[s.length() + 1];
        
        // Base cases
        dp[0] = 1; // There's one way to decode an empty string
        dp[1] = s.charAt(0) == '0' ? 0 : 1; // If the first character is '0', no valid decoding

        // Fill the DP array
        for (int i = 2; i <= s.length(); i++) {
            // Single character decoding
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }
            
            // Two characters decoding
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        // The last element of dp array contains the total number of ways to decode the string
        return dp[s.length()];
    }
}
