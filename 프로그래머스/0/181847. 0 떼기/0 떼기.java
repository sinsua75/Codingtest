class Solution {
    public String solution(String n_str) {
        
        int cnt=0;
        int n =0;
        char[] ch= n_str.toCharArray();
        char First= ch[0];
        
        int temp = 0;
        while(temp < ch.length && ch[temp] == '0'){
            temp++;
        }

        
        char[] ans = new char[ch.length - temp];
        
    
        
        
        for(int i = temp; i < ch.length; i++){
            ans[n++] = ch[i];
        }
        
        String answer = new String(ans);
        
        return answer;
    }
}