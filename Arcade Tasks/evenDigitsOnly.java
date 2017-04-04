boolean evenDigitsOnly(int n) {
    int digits = 0;
    int count = 0;
    int d;
    while(n > 0){
        d = n % 10;
        if(d % 2 == 0){
            count++;
        }
        digits++;
        n /= 10;
    }
    return digits == count;
}
