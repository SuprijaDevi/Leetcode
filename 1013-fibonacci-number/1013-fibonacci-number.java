class Solution {
    public int fib(int n) {
        int num1 = 0; int num2 = 1;
        int num3 = 0;
        for(int i=0; i<n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num1;
    }
}