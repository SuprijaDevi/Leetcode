class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    for(int d=k+1; d<n; d++) {
                        if(nums[i] + nums[j] + nums[k] == nums[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}