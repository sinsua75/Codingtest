class Solution {
    public int[] solution(int n, int[] numlist) {
        int  cnt=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
            cnt++;
            }
        }
        int[] answer = new int[cnt];
        int cnt2=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0)
                answer[cnt2++]= numlist[i];
        }
        return answer;
    }
}