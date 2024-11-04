class Solution {
    public String compressedString(String word) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        int n = word.length();
        char ch = word.charAt(0);
        for(int i=1; i<n; i++) {
            if(word.charAt(i) == ch && count < 9) {
                count++;
            } else {
                compressed.append(count).append(ch);
                ch = word.charAt(i);
                count = 1;
            }
        }
        compressed.append(count).append(ch);
        return compressed.toString();
    }
}