class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] ch = num_str.toCharArray();
        int[] intArray = new int[ch.length];
        
        for(int i = 0; i < ch.length; i++){
            intArray[i] = ch[i] - '0';
        }
        
        for(int i =0; i<intArray.length; i++){
            answer += intArray[i];
        }
        return answer;
    }
}