class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for(int right = 0; right<n; right++) {
            while(charSet.contains(s.charAt(right))) {
            charSet.remove(s.charAt(left));
            left++;
            }
            charSet.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}