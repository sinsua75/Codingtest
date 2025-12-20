class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int i=0;
        while(i<answer.length)
            for(int j=start_num; j<end_num+1; j++){
                answer[i]=j;
                i++;
            }
        return answer;
    }
}