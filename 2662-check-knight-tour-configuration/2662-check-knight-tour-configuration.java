class Solution {
    public boolean checkValidGrid(int[][] gr) {
        int n = gr.length;

        if (gr[0][0] != 0) return false;

        int sr = 0, sc = 0;

        for (int mv = 1; mv < n * n; mv++) {
            boolean fn = false;

            int[] dr = {-2, -1, 1, 2}; 
            for (int r : dr) {
                for (int c : dr) {
                    if (Math.abs(r) != Math.abs(c)) { 
                        int nr = sr + r;
                        int nc = sc + c;
                        if (nr >= 0 && nr < n && nc >= 0 && nc < n && gr[nr][nc] == mv) {
                            sr = nr;
                            sc = nc;
                            fn = true;
                            break;
                        }
                    }
                }
                if (fn) break;
            }
            if (!fn) return false; 
        }
        return true;
    }
}
