class Solution {
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }

            if (isPrime(nums[i][n - i - 1])) {
                max = Math.max(max, nums[i][n - i - 1]);
            }
        }

        return max;
    }
}
