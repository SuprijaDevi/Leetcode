class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList, Collections.reverseOrder());

        if(sortedList.size() >= 3) 
            return sortedList.get(2);
        else
            return sortedList.get(0);
    }
}