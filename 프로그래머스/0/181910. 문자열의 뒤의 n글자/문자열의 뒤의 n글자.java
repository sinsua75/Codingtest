class Solution {
    public String solution(String my_string, int n) {
        
        char[] ch = my_string.toCharArray();
        char[] ans = new char[n];
        int temp =0;
        for(int i= (ch.length -n); i<ch.length; i++)
            ans[temp++]= ch[i] ;
            
            
        String answer = new String(ans);
        return answer;
    }
}