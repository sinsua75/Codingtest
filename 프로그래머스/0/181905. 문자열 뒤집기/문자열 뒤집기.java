class Solution {
    public String solution(String my_string, int s, int e) {
        char[] ch = my_string.toCharArray();
        char[] answerCh = new char[ch.length];
        for(int i =0; i<s; i++){
            answerCh[i] = ch[i];
        }
        
        int end = e;

        for(int i = s; i <= end; i++){
            answerCh[i] = ch[end - (i - s)];
        }

        
        for(int i = e+1; i<ch.length; i++){
            answerCh[i] = ch[i];
        }
        String answer = new String(answerCh);
        return answer;
    }
}