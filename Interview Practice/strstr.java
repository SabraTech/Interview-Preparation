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
