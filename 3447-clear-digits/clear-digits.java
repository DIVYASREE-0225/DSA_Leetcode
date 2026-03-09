class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        int pos = -1;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch >='a' && ch <='z') {
                res.append(ch);
                pos++;
            }
            else {
                res.deleteCharAt(pos);
                pos--;
            }
        }
        return res.toString();
        
    }
}