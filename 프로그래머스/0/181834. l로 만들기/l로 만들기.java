class Solution {
    public String solution(String myString) {
        char[] ch = myString.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] < 'l'){
                ch[i] = 'l';
            }
            else continue;
        }
        String answer = new String(ch);
        return answer;
    }
}