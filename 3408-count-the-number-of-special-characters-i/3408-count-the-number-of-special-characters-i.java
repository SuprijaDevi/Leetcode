class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> seen = new HashSet<>();
        int count = 0;

        for (char c : word.toCharArray()) {
            if (seen.contains(Character.toLowerCase(c)) || seen.contains(Character.toUpperCase(c))) {
                continue;
            }

            seen.add(c);
            char oppositeCase = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);

            if (word.indexOf(oppositeCase) != -1) { 
                count++;
            }
        }
        return count;
    }
}
