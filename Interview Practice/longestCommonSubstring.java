int longestCommonSubstring(String s, String t) {
    int n = s.length();
    int m = t.length();
    int max = 0;
    int[][] dp = new int[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(s.charAt(i) == t.charAt(j)){
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
    }
    return max;
}
