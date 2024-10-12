class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums2) {
            set2.add(num);
        }
        List<Integer> resultSet1 = new ArrayList<>();
        for(int num : set1) {
            if(!set2.contains(num)) {
                resultSet1.add(num);
            }
        } 
        List<Integer> resultSet2 = new ArrayList<>();
        for(int num : set2) {
            if(!set1.contains(num)) {
                resultSet2.add(num);
            }
        } 
        List<List<Integer>> result  = new ArrayList<>();
        result.add(resultSet1);
        result.add(resultSet2);
        return result;
    }
}