class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] chAnswer = s.toCharArray();
        int p =0;
        int y =0;
        
        for(int i =0; i< chAnswer.length; i++){
            if(chAnswer[i] == 'p' || chAnswer[i] == 'P'){
                p += 1;
            }
            else if(chAnswer[i] == 'y' || chAnswer[i] == 'Y'){
                y += 1;
            }
        }
        
        if(p == y) answer = true;
        else answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}