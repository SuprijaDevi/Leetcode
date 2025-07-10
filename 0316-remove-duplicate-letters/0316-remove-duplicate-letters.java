class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        for(int i=0; i<s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(seen[c - 'a']) continue;
            while(!st.isEmpty() && c < st.peek() && lastIndex[st.peek() - 'a'] > i) {
                seen[st.pop() - 'a'] = false;
            }
            st.push(c);
            seen[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}