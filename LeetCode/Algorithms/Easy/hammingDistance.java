class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
        String bits = Integer.toBinaryString(xor);

        for(int i = 0; i < bits.length(); i++){
            if(bits.charAt(i) == '1'){
                cnt++;
            }
        }

        return cnt;

    }
}
