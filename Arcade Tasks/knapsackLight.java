int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    int ans = 0;

    if (weight1 + weight2 <= maxW){
        return value1 + value2;
    }
    if (weight1 <= maxW) {
        ans = value1;
    }
    if (weight2 <= maxW && value2 > ans){
        ans = value2;
    }
    return ans;
}
