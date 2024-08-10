class Solution {
    private int[] parent;
    private int count;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        count = n * n * 4;
        parent = new int[count];
        for (int i = 0; i < parent.length; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int index = i * n + j;
                if (i < n - 1) {
                    union(4 * index + 2, (index + n) * 4);
                }
                if (j < n - 1) {
                    union(4 * index + 1, (index + 1) * 4 + 3);
                }
                char c = grid[i].charAt(j);
                if (c == '/') {
                    union(4 * index, 4 * index + 3);
                    union(4 * index + 1, 4 * index + 2);
                } else if (c == '\\') {
                    union(4 * index, 4 * index + 1);
                    union(4 * index + 2, 4 * index + 3);
                } else {
                    union(4 * index, 4 * index + 1);
                    union(4 * index + 1, 4 * index + 2);
                    union(4 * index + 2, 4 * index + 3);
                }
            }
        }
        return count;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

   
    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA == rootB) {
            return;
        }
        parent[rootA] = rootB;
        --count; 
    }
}
