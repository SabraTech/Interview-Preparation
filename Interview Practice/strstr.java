int strstr(final String haystack, final String needle) {
    int[] f = new int[needle.length()];
    for(int i = 1 , k = 0 ; i < needle.length() ; i++){
        while(k > 0 && needle.charAt(i) != needle.charAt(k))
            k = f[k-1];
        if(needle.charAt(i) == needle.charAt(k))
            k++;
        f[i] = k;
    }
    for(int i = 0 , k = 0 ; i < haystack.length() ; i++){
        while(k>0 && haystack.charAt(i) != needle.charAt(k))
            k = f[k-1];
        if(haystack.charAt(i) == needle.charAt(k)){
            k++;
        }
        if(k == needle.length()){
            return i - k + 1;
        }
    }
    return -1;
}

// Or
// =============================================================================
int strstr(String s, String x) {
    if(x.length() > s.length()){
        return -1;
    }
    final long B = 31;
    final long mod = 1000000007;
    long hash1 = 0;
    long[] hp = new long[x.length()];
    hp[0] = 1;
    for(int i = 1 ; i < x.length() ; i++){
        hp[i] = B * hp[i-1];
        hp[i]%= mod;
    }
    char[] needle = x.toCharArray();
    for(char c : needle){
        hash1 = hash1 * B + c;
        hash1 %= mod;
    }
    int n = x.length();
    long hash2 = 0;
    for(int i = 0 ; i < n ; i ++){
        hash2 = B * hash2 + s.charAt(i);
        hash2 %= mod;
    }
    int start = 0 , end = n-1;
    while(end < s.length()){
        if(hash1 == hash2){
            boolean isEqual = true;
            for(int i = 0 , j = start ; i < n ; i ++ , j ++){
                if(needle[i] != s.charAt(j))
                    isEqual = false;
            }
            if(isEqual)
                return start;
        }
        hash2 -= (hp[n-1] * s.charAt(start))%mod;
        hash2 += mod;
        hash2 %= mod;
        start ++;
        end ++;
        if(end < s.length())
            hash2 = hash2 * B + s.charAt(end);
        hash2 %= mod;
    }
    return -1;
}
