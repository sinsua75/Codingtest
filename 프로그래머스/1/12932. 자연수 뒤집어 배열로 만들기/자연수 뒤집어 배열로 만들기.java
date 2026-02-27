class Solution {
    public int[] solution(long n) {

        int length = String.valueOf(n).length();
        int[] answer = new int[length];

        for(int i = length - 1; i >= 0; i--) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        int temp = answer.length -1;
        int[] arr = new int[answer.length];
        for(int i =0; i<answer.length; i++){
            arr[i] = answer[i];
        }
        for(int i = 0; i<answer.length; i++){
            answer[i] = arr[temp --];
        }
        
        return answer;
    }
}