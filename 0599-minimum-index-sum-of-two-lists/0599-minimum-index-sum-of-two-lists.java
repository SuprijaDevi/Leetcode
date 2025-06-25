class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = list1.length;
        int m = list2.length;
        int least = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            map.put(list1[i], i);
        }
        for(int j=0; j<m; j++) {
            if(map.containsKey(list2[j])) {
                int i = map.get(list2[j]);
                if((i + j) < least) {
                    answer.clear();
                    answer.add(list2[j]);
                    least = i + j;
                } else if (i + j == least) {
                    answer.add(list2[j]);
                }
            }
        }
        return answer.toArray(new String[0]);
    }
}