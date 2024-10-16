class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int num1 = 0; int num2 = 1; int num3 = 1;
        int sum = 0;
        for(int i=3; i<=n; i++) {
            sum = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = sum;
        }
        return sum;
    }
}