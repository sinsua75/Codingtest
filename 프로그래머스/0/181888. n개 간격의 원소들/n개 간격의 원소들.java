class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length + n - 1) / n];
        int num = 0;

        for(int i = 0; i < num_list.length; i++){
            if(i == 0 || i % n == 0){
                answer[num++] = num_list[i];
            }
        }

        return answer;
    }
}
