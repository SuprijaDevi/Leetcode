class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1]; 
        for (int num : nums) {
            count[num]++;
        }
        
        int duplicate = -1, missing = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                duplicate = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}