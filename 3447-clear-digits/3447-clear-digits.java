class Solution {
    public String clearDigits(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(ch[i])) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}