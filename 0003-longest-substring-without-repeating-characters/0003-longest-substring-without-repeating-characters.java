class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
        return 0;
        if(s.length() == 1)
        return 1;
        int left = 0, right = 0, maxLength = 0;
        boolean visited[] = new boolean[256];
        while(right < s.length()) {
            while(visited[s.charAt(right)]) {
                visited[s.charAt(left)] = false;
                left++;
            }
            visited[s.charAt(right)] = true;
            maxLength = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }
}