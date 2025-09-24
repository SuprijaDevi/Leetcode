class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(i > 0 && ((nums[i] - nums[i - 1]) > max)) {
                max = nums[i] - nums[i - 1];
            }
        }
        return max;
    }
}