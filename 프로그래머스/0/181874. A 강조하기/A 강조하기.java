class Solution {
    public String solution(String myString) {
        char[] ch = myString.toCharArray();
        for(int i = 0 ; i< ch.length; i++){
            if(ch[i] == 'A') continue;
            else if(ch[i] == 'a') 
                ch[i] = Character.toUpperCase(ch[i]);
            else ch[i] = Character.toLowerCase(ch[i]);
        }
        String answer = new String(ch);
        return answer;
    }
}