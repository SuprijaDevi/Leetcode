class Solution {
    public int maxFreqSum(String s) {
        int freq = 0;
        Map<Character, Integer> vowel = new HashMap<>();
        Map<Character, Integer> consonant = new HashMap<>();
        for(char c : s.toCharArray()) {
            if("aeiou".indexOf(c) != -1) {
                vowel.put(c, vowel.getOrDefault(c, 0) + 1);
            } else {
                consonant.put(c, consonant.getOrDefault(c, 0) + 1);
            }
        }
        int vFreq = 0, cFreq = 0;
        for(int val : vowel.values()) {
            vFreq = Math.max(vFreq, val);
        }
        for(int val : consonant.values()) {
            cFreq = Math.max(cFreq, val);
        }
        freq = vFreq + cFreq;
        return freq;
    }
}