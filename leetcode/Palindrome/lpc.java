class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String result = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j)) {
                    if ( j == i + 1 || dp[i+1][j-1]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j] && result.length() < j - i +1) {
                    result = s.substring(i, j+1);
                }
            }
        }
        return result;
        
    }
}
