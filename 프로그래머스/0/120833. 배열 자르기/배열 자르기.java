class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len= num2-num1+1;
        int[] answer = new int[len];
        int j=num1;
        for(int i=0; i<len; i++){
            answer[i]=numbers[j];
            j++;
        }
        return answer;
    }
}