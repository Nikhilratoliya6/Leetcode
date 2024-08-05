import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        HashMap<String, Integer> rowMap = new HashMap<>();
        HashMap<String, Integer> colMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            StringBuilder rowKey = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowKey.append(grid[i][j]).append(",");
            }
            rowMap.put(rowKey.toString(), rowMap.getOrDefault(rowKey.toString(), 0) + 1);
        }

       
        for (int j = 0; j < n; j++) {
            StringBuilder colKey = new StringBuilder();
            for (int i = 0; i < m; i++) {
                colKey.append(grid[i][j]).append(",");
            }
            colMap.put(colKey.toString(), colMap.getOrDefault(colKey.toString(), 0) + 1);
        }

        
        for (String key : rowMap.keySet()) {
            if (colMap.containsKey(key)) {
                count += rowMap.get(key) * colMap.get(key);
            }
        }

        return count;
    }
}
