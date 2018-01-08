public class Solution {
public int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            sum = (sum%10 + sum/10);
            num /= 10;
        }
        return sum;
    }
}
