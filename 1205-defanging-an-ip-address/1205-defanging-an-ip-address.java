class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer(address);
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == '.') {
                sb.replace(i, i+1, "[.]");
                i += 2;
            }
        }
        return sb.toString();
    }
}