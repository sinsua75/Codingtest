class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a1;
        boolean a2;

        if(x1 == true || x2 == true){
            a1 = true;
        } else {
            a1 = false;
        }

        if(x3 == true || x4 == true){
            a2 = true;
        } else {
            a2 = false;
        }

        if(a1 == false || a2 == false){
            answer = false;
        }

        return answer;
    }
}
