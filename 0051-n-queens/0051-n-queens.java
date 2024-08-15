import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] chess = new int[n][n];
        List<List<String>> results = new ArrayList<>();
        printQueens(chess, new ArrayList<>(), 0, results);
        return results;
    }

    public static void printQueens(int[][] chess, List<String> qsf, int row, List<List<String>> results) {
        if (row == chess.length) {
            results.add(new ArrayList<>(qsf));
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                qsf.add(constructString(chess.length, col));
                printQueens(chess, qsf, row + 1, results);
                qsf.remove(qsf.size() - 1); 
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static String constructString(int n, int col) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == col) {
                sb.append("Q");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
