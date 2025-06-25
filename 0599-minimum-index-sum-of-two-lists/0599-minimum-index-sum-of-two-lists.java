class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> answer = new ArrayList<String>();
        int n = list1.length;
        int m = list2.length;
        int least = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(list1[i].equals(list2[j])) {
                    if((i + j) < least) {
                        answer.clear();
                        answer.add(list1[i]);
                        least = i + j;
                    } else if (i + j == least) {
                        answer.add(list1[i]);
                    }
                }
            }
        }
        return answer.toArray(new String[0]);
    }
}