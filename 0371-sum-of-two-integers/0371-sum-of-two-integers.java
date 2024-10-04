import java.math.*;
class Solution {
    public int getSum(int a, int b) {
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger sum = num1.add(num2);
        return sum.intValue();
    }
}