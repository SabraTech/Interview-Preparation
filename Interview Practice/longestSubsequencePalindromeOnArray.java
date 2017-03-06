int longestSubsequencePalindrome(int[] a) {
    int len = a.length;
    int[][] dp = new int[len][len];
    for (int i = 0; i < len; ++i) {
        dp[i][i] = 1;
    }
    for (int l = 2; l <= len; ++l) {
        for (int i = 0; i + l <= len; ++i) {
             int j = i + l - 1;
                if (a[i] == a[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][len - 1];
}
