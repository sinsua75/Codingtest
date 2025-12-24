class Solution {
    public String solution(String cipher, int code) {
        char[] arr= cipher.toCharArray();
        char[] charAnswer = new char[arr.length/code];
        int num =1;
        
        for(int i =0; i<charAnswer.length; i++){
            charAnswer[i] = arr[code*num-1];
            num++;
        }
        
        
        String answer = new String(charAnswer);
        return answer;
    }
}