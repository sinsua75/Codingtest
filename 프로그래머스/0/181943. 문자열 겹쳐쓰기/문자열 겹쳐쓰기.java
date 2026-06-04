class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        char[] ch_myString = my_string.toCharArray();
        char[] ch_overWrite = overwrite_string.toCharArray();
        int cnt =0;
        for(int i= s; i< ch_myString.length; i++){
            if(cnt == ch_overWrite.length) break;
             ch_myString[i] = ch_overWrite[cnt++];
        }
        
        String answer = new String(ch_myString);
        return answer;
    }
}