class Solution {
    public String solution(String my_string, String alp) {
        
        char[] ch = my_string.toCharArray();
        char[] ans = new char[ch.length];
        char c = alp.charAt(0);
        for(int i =0; i<ch.length; i++){
            if(c==ch[i]){
                ans[i]=Character.toUpperCase(ch[i]);
            } else ans[i] = ch[i];
        }
        
        String answer = new String(ans);
        return answer;
    }
}