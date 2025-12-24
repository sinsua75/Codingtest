class Solution {
    public int[] solution(int n) {
        
        int num=0;
        for(int i =1; i<=n; i++){
            if(n%i==0){
                num++;
            }
        }
        
        int[] answer = new int[num];
        int j=0;
        while(j<answer.length){
            for(int i =1; i<=n; i++){
                if(n%i==0){
                    answer[j]= i;
                    j++;
                }
            }
        }
        
    
        return answer;
    }
}