class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(!st.isEmpty()) {
                    result.append(c);
                }
                st.push(c);
            } else {
                st.pop();
                if(!st.isEmpty()) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}