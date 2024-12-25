class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> small = new HashSet<>();
        Set<Character> capital = new HashSet<>();

        for(char c : word.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                small.add(c);
            } else {
                capital.add(c);
            }
        }
        int count = 0;
        for(char c : small) {
            if(capital.contains(Character.toUpperCase(c))) {
                count++;
            }
        }
        return count;
    }
}