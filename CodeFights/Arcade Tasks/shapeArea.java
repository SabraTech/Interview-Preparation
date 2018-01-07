int shapeArea(int n) {
    int ans = 1;
    for(int i = 0; i < n; i++){
        ans += i * 4;
    }
    return ans;
}
