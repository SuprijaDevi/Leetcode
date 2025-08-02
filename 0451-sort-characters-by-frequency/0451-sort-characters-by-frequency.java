class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        queue.addAll(freqMap.entrySet());
        StringBuilder result = new StringBuilder();
        while(!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            char ch = entry.getKey();
            int count = entry.getValue();
            for(int i=0; i<count; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}