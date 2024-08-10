class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        return max(haystack, 0, needle);
    }

    public int max(String haystack, int i, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();

       
        if (i + needleLength > haystackLength) {
            return -1;
        }

      
        if (haystack.substring(i, i + needleLength).equals(needle)) {
            return i;
        } else {
            return max(haystack, i + 1, needle);
        }
    }
}
