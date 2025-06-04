class Solution {
    
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n > m || m > n) return false;
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) return true; 
            }
            return false; 
        }
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                difference.add(i);
            }
        }
        return difference.size() == 2 &&
            s.charAt(difference.get(0)) == goal.charAt(difference.get(1)) &&
            s.charAt(difference.get(1)) == goal.charAt(difference.get(0));
    }
}