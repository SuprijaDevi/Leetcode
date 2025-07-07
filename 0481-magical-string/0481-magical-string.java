class Solution {
    public int magicalString(int n) {
        int result = 1, idx = 1;
        String str = "1";
        while(str.length() < n) {
            if(idx % 2 == 1) {
                if(idx == 1) {
                    str += "22";
                } else {
                    if(str.charAt(idx) == '2') {
                        str += "22";
                    } else {
                        str += "2";
                    }
                }
            } else {
                if(str.charAt(idx) == '2') {
                    str += "11";
                    result += 2;
                } else {
                    str += "1";
                    result += 1;
                }
            }
            idx++;
        }
        if(str.length() > n && str.charAt(str.length() - 1) == '1') {
            result--;
        }
        return result;
    }
}