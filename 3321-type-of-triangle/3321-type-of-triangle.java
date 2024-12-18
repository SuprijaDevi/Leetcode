class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } 
        Arrays.sort(nums);
        if(nums[0] + nums[1] > nums[2]) {
            if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        }
        return "none";
    }
}