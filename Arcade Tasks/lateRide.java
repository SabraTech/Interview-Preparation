int lateRide(int n) {
    int h = n / 60;
    int m = n % 60;
    int ans = (h / 10) + (h % 10) + (m / 10) + (m % 10);
    return ans;
}
