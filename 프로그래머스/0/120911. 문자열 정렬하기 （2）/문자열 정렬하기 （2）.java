class Solution {
    public String solution(String my_string) {
        String string = my_string.toLowerCase();
        char[] ch= string.toCharArray();
        
        for(int i=0; i<ch.length-1; i++)
            for(int j=0; j<ch.length-1-i; j++){
                if(ch[j] > ch[j+1]){
                    char temp= ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        String answer = new String(ch);
        return answer;
    }
}