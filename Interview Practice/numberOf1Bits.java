int numberOf1Bits(int n) {
    int numOnes = 0;
    while (n != 0) {
        if ((n & 1) == 1) {
            numOnes++;
        }
        n >>= 1;
    }
    return numOnes;
}
