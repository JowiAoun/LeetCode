// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class P28 {
    public int strStr(String haystack, String needle) {
        char[] _haystack = haystack.toCharArray();
        char[] _needle = needle.toCharArray();
        int h_len = _haystack.length;
        int n_len = _needle.length;

        if (n_len > h_len) { return -1; }

        outer: for (int i=0; i<h_len; i++) {
            for (int j=0; j<n_len; j++) {
                System.out.println(_needle[j] + " in " + _haystack[i] + " (" + j + ", " + i + ")"); //! test
                if (_needle[j] != _haystack[i]) {
                    i -= j;
                    continue outer;
                }
                i++;
            }
            return i - n_len;
        }
        return -1;
    }
}

class P28Test {
    public static void main(String[] args) {
        P28 p28 = new P28();

        String haystack = "mississippi";
        String needle = "issipi";

        int result = p28.strStr(haystack, needle);
        System.out.println("Result: " + result);
    }
}