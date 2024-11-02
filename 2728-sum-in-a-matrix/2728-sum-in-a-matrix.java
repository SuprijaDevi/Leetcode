class Solution {
    public int matrixSum(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        int sum = 0;
        for(int[] rowArr : nums) {
            Arrays.sort(rowArr);
        }
        for(int i=0; i<col; i++) {
            int max = 0;
            for(int j=0; j<row; j++) {
                max = Math.max(max, nums[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}