class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;

        for(int i = 1; temp <= n; i++){
            temp *= i;
            answer = i-1;
        }

        return answer;
    }
}
