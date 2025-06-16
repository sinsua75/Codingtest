class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a=0; a<=Math.sqrt(n); a++){
            if(n==a*a)
                answer=1;
            else if(n!=a*a)
                answer=2;
        
        }
        return answer;
    }
}