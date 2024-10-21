class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[] = new char[sentence.length()];
	    for(int i=0; i<ch.length; i++) {
	        ch[i] = sentence.charAt(i);
	    }
	    Arrays.sort(ch);
	    if(ch.length >= 26) {
    	    int chAscii = 97;
    	    int count = 0;
    	    for(int i=0; i<ch.length; i++) {
    	        if(ch[i] == chAscii) {
    	            count++;
    	            chAscii++;
    	        } else if(i > 0 && ch[i] == ch[i-1]) {
    	            continue;
    	        } else {
    	            break;
    	        }
    	    }
    	    return count == 26;
	    }
        return false;
    }
}