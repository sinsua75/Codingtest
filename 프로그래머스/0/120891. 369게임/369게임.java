class Solution {
    public int solution(int order) {
        int answer = 0;
        int cnt =0;
        char[] ch = String.valueOf(order).toCharArray();
        for(int i =0; i<ch.length; i++){
            if(ch[i] == '3' || ch[i] == '6' || ch[i] == '9'){
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }
}