class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagic(grid, i, j)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean isMagic(int[][] grid, int rowStart, int colStart) {
        boolean[] vis = new boolean[10];
        
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || vis[num]) {
                    return false;
                }
                vis[num] = true;
            }
        }

        int sum = grid[rowStart][colStart] + grid[rowStart][colStart + 1] + grid[rowStart][colStart + 2];

        for (int i = 0; i < 3; i++) {
            if (grid[rowStart + i][colStart] + grid[rowStart + i][colStart + 1] + grid[rowStart + i][colStart + 2] != sum) {
                return false;
            }
            if (grid[rowStart][colStart + i] + grid[rowStart + 1][colStart + i] + grid[rowStart + 2][colStart + i] != sum) {
                return false;
            }
        }

        if (grid[rowStart][colStart] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart + 2] != sum) {
            return false;
        }
        if (grid[rowStart][colStart + 2] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart] != sum) {
            return false;
        }

        return true;
    }
}
