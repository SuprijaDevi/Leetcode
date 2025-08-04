class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                al.add(i);
                // if(al.size() >= 1 && nums[i] != nums[i + 1]) break;
            }
        }
        return al;
    }
}