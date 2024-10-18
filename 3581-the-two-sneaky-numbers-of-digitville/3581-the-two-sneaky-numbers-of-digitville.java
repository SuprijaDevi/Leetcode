class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    ans.add(nums[i]);
                }
            }
        }
        int sneaky[] = new int[ans.size()];
        int k = 0;
        for(int i=0; i<sneaky.length; i++) {
            sneaky[k++] = ans.get(i);
        }
        return sneaky;
    }
}