class Solution {
    public int solution(int n, int t) {
        int answer = n;
        //1시간 n*2
        //2시간 n*2*2
        for(int i=1; i<=t; i++)
            answer*= 2;
        return answer;
    }
}