class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, maxFreq = 0, result = 0;
        for(int j=0; j<s.length(); j++) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

            while((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}