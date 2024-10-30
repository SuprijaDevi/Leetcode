class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int n = nums.length;
        for(int[] arr : nums) {
            for(int num : arr) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> num : count.entrySet()) {
            if(num.getValue() == n) {
                result.add(num.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}