class Solution {
    public int findPeakElement(int[] nums) {
        int peek = nums[0];
        int peekIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > peek) {
                peek = nums[i];
                peekIndex = i;
            }
        }
        return peekIndex;
    }
}