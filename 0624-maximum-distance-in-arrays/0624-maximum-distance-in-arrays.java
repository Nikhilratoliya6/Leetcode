class Solution {
   public int maxDistance(List<List<Integer>> arrays) {

    int minSoFar = 10000;
    int maxSoFar = -10000;

    int ans = Integer.MIN_VALUE;

    for (int i = 0; i < arrays.size(); i++) {

        int currMin = arrays.get(i).get(0);
        int currMax = arrays.get(i).get(arrays.get(i).size() - 1);

        ans = Math.max(ans, maxSoFar - currMin);
        ans = Math.max(ans, currMax - minSoFar);

        maxSoFar = Math.max(maxSoFar, currMax);
        minSoFar = Math.min(minSoFar, currMin);

    }

    return ans;

}
}