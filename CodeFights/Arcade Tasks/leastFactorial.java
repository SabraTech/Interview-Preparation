int leastFactorial(int n) {
    int prod = 1;
    int i = 2;
    while(prod < n){
        prod *= i++;
    }
    return prod;
}
