class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char c : s.toCharArray()) {
            if("AEIOUaeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        int i = 0;
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            if("AEIOUaeiou".indexOf(c) != -1) {
                result.append(vowels.get(i));
                i++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}