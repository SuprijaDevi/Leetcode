class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int xor = 0;
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.get(num) == 2) {
                xor ^= num;
            }
        }
        return xor;
    }
}