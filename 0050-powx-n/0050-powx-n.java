class Solution {
    public double power(double x, long n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n % 2 == 0) {
            return power(x * x, n / 2);
        } else {
            return x * power(x, (n - 1));
        }
    }
    public double myPow(double x, int n) {
        if(n < 0) {
            // x = 1 / x;
            long m = (long)n;
            m = -1 * m;
            return 1/power(x, m);
        } else {
            return power(x, (long)n);
        }
    }
}