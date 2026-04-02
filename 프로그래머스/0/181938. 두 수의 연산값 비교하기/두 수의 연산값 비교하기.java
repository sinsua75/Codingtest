class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stA = String.valueOf(a);
        String stB = String.valueOf(b);
        String AB = stA + stB ;
        int ab = Integer.parseInt(AB);
        
        int ab2 = 2 * a * b;
        
        
        if(ab> ab2) answer = ab;
        else answer = ab2;
        
        return answer;
    }
}