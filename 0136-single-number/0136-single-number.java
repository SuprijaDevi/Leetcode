class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int singleOne : nums) {
            result ^= singleOne;
        }
        return result;
    }
}