class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int num : nums) {
            count.put(num, count.getOrDefault(num,  0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}