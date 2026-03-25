class Solution {
    public String solution(String str1, String str2) {
        char[] strChar1 = str1.toCharArray();
        char[] strChar2 = str2.toCharArray();
        char[] charAnswer = new char[strChar1.length+strChar2.length];
        int s =0;
        int d =0;
        for(int i=0; i<charAnswer.length; i++){
            if(i%2==0){
                charAnswer[i] = strChar1[s++];
            }
            else if(i%2==1){
                charAnswer[i] = strChar2[d++];
            }
            
        }
        
        
        String answer = new String(charAnswer);
        return answer;
    }
}