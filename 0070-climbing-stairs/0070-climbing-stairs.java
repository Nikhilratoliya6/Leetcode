import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsMemo(n, memo);
    }

    private int climbStairsMemo(int n, Map<Integer, Integer> memo) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int p1 = climbStairsMemo(n - 1, memo);
        int p2 = climbStairsMemo(n - 2, memo);
        int result = p1 + p2;

        memo.put(n, result);  

        return result;
    }

   
}
