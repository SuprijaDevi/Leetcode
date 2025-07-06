class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        while(left < right){
            if(!Character.isLetter(c[left])){
                left++;
            } else if(!Character.isLetter(c[right])){
                right--; 
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(c);
    }
}