class Solution {
    public String solution(int q, int r, String code) {
        int num =0;
        char[] ch = code.toCharArray();
        for(int i =0; i<ch.length; i++){
            if(i%q == r){
                num++;
            }
            else continue;
        }
        
        char[] chAnswer = new char[num];
        int j =0;
        for(int i =0; i<ch.length; i++){
            if(i%q == r){
                chAnswer[j] = ch[i];
                j++;
            }
        }
        String answer = new String(chAnswer);
        return answer;
    }
}