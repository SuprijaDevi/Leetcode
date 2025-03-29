class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // int n = asteroids.length;
        // Stack<Integer> st = new Stack<>();
        // for(int i=n-1; i>0; i--) {
        //     if((asteroids[i] < 0 && asteroids[i - 1] > 0) || (asteroids[i - 1] > 0 && asteroids[i] < 0) || (asteroids[i] < 0 && asteroids[i - 1] < 0)) {
        //         int num1 = Math.abs(asteroids[i]);
        //         int num2 = Math.abs(asteroids[i - 1]);
        //         if(num1 < num2) {
        //             st.push(num2);
        //             asteroids[i - 1] = num2;
        //         } else {
        //             st.push(num1);
        //             asteroids[i - 1] = num1;
        //         }
        //     } else {
        //         st.push(asteroids[i]);
        //     }
        // }
        // int arr[] = new int[st.size()];
        // for(int j=0; j<st.size(); j++) {
        //     arr[j] = st.pop();
        // }
        // return arr;
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids) {
            boolean destroyed = false;
            while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if(Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                    continue;
                } else if(Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }
            if(!destroyed) {
                stack.push(asteroid);
            }
        }
        int result[] = new int[stack.size()];
        for(int i=result.length-1; i>=0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}