class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        } else if (num == 1) {
            return true;
        }

        while (num != 4 && num % 4 == 0) {
            num /= 4;
        }

        if (num == 4) {
            return true;
        } else {
            return false;
        }

    }
}
