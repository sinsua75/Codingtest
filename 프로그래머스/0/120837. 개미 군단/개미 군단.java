class Solution {
    public int solution(int hp) {
        int answer = 0;
        int wkd=hp/5;
        int qud=(hp%5)/3;
        int dlf=(hp%5)%3;
        answer= wkd+qud+dlf;
        return answer;
    }
}