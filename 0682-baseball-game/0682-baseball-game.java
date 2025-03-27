class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations) {
            if(s.equals("+")) {
                int sum1 = stack.pop();
                int sum2 = stack.peek();
                stack.push(sum1);
                stack.push(sum1 + sum2);
            } else if(s.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if(s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}