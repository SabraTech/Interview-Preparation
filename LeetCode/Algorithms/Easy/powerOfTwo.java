public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;

    while(n>2){
        int t = n>>1;
        int c = t<<1;

        if(n-c != 0)
            return false;

        n = n>>1;
    }

    return true;

    }
}
