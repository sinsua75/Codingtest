class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int num = 0;
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                num++;   // ← 여기
            }
        }

        int n = 0;
        String[] answer = new String[num];
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                answer[n++] = todo_list[i];
            }
        }

        return answer;
    }
}
