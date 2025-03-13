class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()>=3){
            return set.lower(set.lower(set.last()));
        }
        return set.last();
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums) {
        //     set.add(num);
        // }
        // List<Integer> sortedList = new ArrayList<>(set);
        // Collections.sort(sortedList, Collections.reverseOrder());

        // if(sortedList.size() >= 3) 
        //     return sortedList.get(2);
        // else
        //     return sortedList.get(0);

    }
}