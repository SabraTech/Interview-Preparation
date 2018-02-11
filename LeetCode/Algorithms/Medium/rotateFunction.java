class Solution {
    public int maxRotateFunction(int[] A) {
        int k = A.length;
        int f = 0, sum = 0;
        for(int i = 0; i < k; i++){
            f += i * A[i];
            sum += A[i];
        }
        int max = f;
        for(int i = k - 1; i >= 1; i--){
            f = f + sum - k * A[i];
            max = Math.max(f, max);
        }
        return max;
    }
}
