class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr = "";
        String evenStr = "";
        for(int i =0; i<num_list.length; i++){
            if(num_list[i] % 2 ==1){
                oddStr += String.valueOf(num_list[i]);
            }else evenStr += String.valueOf(num_list[i]);
        }
        
        answer = answer = Integer.parseInt(oddStr) + Integer.parseInt(evenStr);
        return answer;
    }
}