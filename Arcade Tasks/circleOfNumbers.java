int circleOfNumbers(int n, int firstNumber) {
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = i;
    }
    int dist = n / 2, ans = 0;
    for (int i = 0; i <= n / 2; i++) {
        ans = arr[(i + firstNumber) % n];
    }
    return ans;
}
