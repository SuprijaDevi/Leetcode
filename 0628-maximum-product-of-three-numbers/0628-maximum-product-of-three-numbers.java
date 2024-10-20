class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int positiveProd = nums[n-1] * nums[n-2] * nums[n-3];
        int negativeProd = nums[0] * nums[1] *nums[n-1];
        return Math.max(positiveProd, negativeProd);
    }
}