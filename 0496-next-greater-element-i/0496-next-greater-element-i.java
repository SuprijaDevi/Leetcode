class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int found = -1;
            int next = -1;
            for(int j=0; j<m; j++) {
                if(nums1[i] == nums2[j]) {
                    found = j;
                    break;
                }
            }
            if(found != -1) {
                for(int k=found+1; k<m; k++) {
                    if(nums2[k] > nums1[i]) {
                        next = nums2[k];
                        break;
                    }
                }
            }
            ans.add(next);
        }
        int nextGreater[] = new int[ans.size()];
        for(int i=0; i<nextGreater.length; i++) {
            nextGreater[i] = ans.get(i);
        }
        return nextGreater;
    }
}