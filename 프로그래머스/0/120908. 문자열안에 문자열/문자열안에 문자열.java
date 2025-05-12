class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)) // str1안에 str2가 들어있다는걸 식으로 적은거
            answer=1;
        else
            answer=2;
        return answer;
    }
}