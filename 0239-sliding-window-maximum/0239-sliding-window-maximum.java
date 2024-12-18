class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        // int n = nums.length;
        // for(int i=0; i<=n-k; i++) {
        //     int maximum = nums[i]; 
        //     for(int j=i; j<i+k; j++) {
        //         maximum = Math.max(nums[j], maximum);
        //     }
        //     list.add(maximum);
        // }
        // int len = list.size();
        // int result[] = new int[len];
        // for(int i=0; i<len; i++) {
        //     result[i] = list.get(i);
        // }
        // return result;

        int n = nums.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        Deque < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = nums[q.peek()];
            }
        }
        return r;
    }
}