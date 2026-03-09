class Solution {
    public int[] solution(int[][] score) {
        
        int n = score.length;
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++){
            int rank = 1;
            
            for(int j = 0; j < n; j++){
                
                int sum1 = score[i][0] + score[i][1];
                int sum2 = score[j][0] + score[j][1];
                
                if(sum1 < sum2){
                    rank++;
                }
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}