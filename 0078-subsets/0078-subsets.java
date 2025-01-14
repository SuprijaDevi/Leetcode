class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubset(0, nums, new ArrayList<>(), result);
        return result;
    }
    private static void backtrackSubset(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++) {
            current.add(nums[i]);
            backtrackSubset(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}