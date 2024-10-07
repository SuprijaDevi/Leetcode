class Solution {
    public int minLength(String s) {
        Stack<Character> set = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(!set.isEmpty() && ((set.peek() == 'A' && ch == 'B') || (set.peek() ==      'C' && ch == 'D'))) {
                set.pop();
            } else {
                set.push(ch);
            }
        }
        return set.size();
    }
}