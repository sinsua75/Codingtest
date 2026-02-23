class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for(int i = 0; i < order.length; i++){

            if(order[i].contains("cafelatte")){
                answer += 5000;
            }
            else {   // 나머지는 전부 아메리카노 취급
                answer += 4500;
            }
        }

        return answer;
    }
}