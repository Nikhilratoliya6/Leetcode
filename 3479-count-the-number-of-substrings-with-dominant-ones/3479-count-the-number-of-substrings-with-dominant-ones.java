import java.util.Arrays;

class Solution {
    public int numberOfSubstrings(String s) {

        int N = s.length();
        int[] prevZero = new int[N];
        int[] nextZero = new int[N];
        Arrays.fill(prevZero, -1);
        Arrays.fill(nextZero, N);
        // TODO: init

        int prev = -1;
        for (int i = 0; i < N; i++) {
            prevZero[i] = prev;
            if (s.charAt(i) == '0') {
                prev = i;
            }
        }
        int next = N;
        for (int i = N - 1; i >= 0; i--) {
            nextZero[i] = next;
            if (s.charAt(i) == '0') {
                next = i;
            }
        }


        int ans = 0;

        // count all 1s
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '1') {
                ans += nextZero[i] - i;

            }
        }

        for (int z = 1; z * z + z <= N; z++) {
            int zero = 0;
            int j = 0;
            while (j < N && zero < z) {
                if (s.charAt(j) == '0') {
                    zero++;
                }
                j++;
            }
            if (zero < z) {
                break;
            }
            j--;
            int i = 0;
            while (s.charAt(i) == '1') {
                i++;
            }

            int left = i - prevZero[i] - 1;
            int right = nextZero[j] - j - 1;
            int middle = j - i + 1 - z;

            ans += compute(left, right, middle, z * z);

            // System.out.printf("i=%d j=%d left=%d r=%d m=%d z=%d, cpt=%d\n", i, j, left, right, middle, z, compute(left, right, middle, z * z));

            while (true) {
                i = nextZero[i];
                j = nextZero[j];
                if (j >= N) {
                    break;
                }

                left = i - prevZero[i] - 1;
                right = nextZero[j] - j - 1;
                middle = j - i + 1 - z;
                ans += compute(left, right, middle, z * z);


                // System.out.printf("i=%d j=%d left=%d r=%d m=%d z=%d, cpt=%d\n", i, j, left, right, middle, z, compute(left, right, middle, z * z));
            }
        }
        return ans;

    }

    private int compute(int l, int r, int m, int total) {
        if (l + r + m < total) {
            return 0;
        }
        if (m >= total) {
            return (l + 1) * (r + 1);
        }
        return compute(l, r, total - m);
    }

    private int compute(int l, int r, int total) {
        if (l + r < total) {
            return 0;
        }
        if (l + r == total) {
            return 1;
        }
        int lmin = Math.max(0, total - r);

        // lmin -> r
        // lmin + 1 -> r, r-1
        // ...
        // l -> total - l ... r
        
        // ->2 1 1
        // 0+1
        // 1+0, 1+1
        // 2+0, 2+1

        int ans = 0;
        for (int ll = lmin; ll <= l; ll++) {
            int rmin = Math.max(0, total - ll);
            ans += r - rmin + 1;
        }

        return ans;
    }
}