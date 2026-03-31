class Solution {
    public int solution(String[] strArr) {
        int[] num = new int[31];
        
        for(int i = 0; i < strArr.length; i++){
            int len = strArr[i].length();
            num[len]++;
        }
        
        int max = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        
        return max;
    }
}