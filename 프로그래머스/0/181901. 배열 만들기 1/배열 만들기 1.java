class Solution {
    public int[] solution(int n, int k) {
        
        int num =0;
        int a =1;
        for(int i =1; k*i<=n;i++){
            num++;
        }
        
        int[] answer = new int[num];
        for(int i =0; k*a<=n;i++){
            answer[i] = k*a;
            a++;
        }
        
        
        return answer;
    }
}