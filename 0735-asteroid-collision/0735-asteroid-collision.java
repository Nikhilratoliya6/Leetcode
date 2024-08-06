import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            boolean destroyed = false;
            
            while (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                if (st.peek() < -asteroids[i]) {
                    st.pop();
                } else if (st.peek() == -asteroids[i]) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            
            if (!destroyed) {
                st.push(asteroids[i]);
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>(st);
        int[] arr1 = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            arr1[i] = arr.get(i);
        }
        
        return arr1;
    }
}
