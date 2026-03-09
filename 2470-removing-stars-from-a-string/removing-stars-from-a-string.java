class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();

        for(int i =0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch != '*') {
                st.push(ch);
            }
            else {
                st.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<st.size();i++){
            res.append(st.get(i));
        }
        return res.toString();
        
    }
}