class Solution {
    public int maxFreqSum(String s) {
        int vFreq = 0, cFreq = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            int count = freqMap.get(c);
            
            if ("aeiou".indexOf(c) != -1) {
                vFreq = Math.max(vFreq, count); 
            } else {
                cFreq = Math.max(cFreq, count); 
            }
        }
        
        return vFreq + cFreq;
    }
}