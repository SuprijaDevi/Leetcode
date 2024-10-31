class Solution {
    public int maxProduct(int[] nums) {
        // int max = 0, ans;
        // for(int i=0; i<nums.length-1; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         ans = (nums[i] - 1) * (nums[j] - 1);
        //         if(ans > max) {
        //             max = ans;
        //         }
        //     }
        // }
        // return max;
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[n - 2];
        int second = nums[n - 1];
        int max = (first - 1) * (second - 1);
        if(max > 0) {
            return max;
        } 
        return 0;
    }
}