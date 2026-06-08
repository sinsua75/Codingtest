class Solution {
    public int solution(int[] numbers) {
        int[] numBer = {0,1,2,3,4,5,6,7,8,9};
        for(int i =0; i<numbers.length; i++)
            for(int j =0; j<numBer.length; j++){
                if(numbers[i]== numBer[j]){
                    numBer[j] = 0;
                }
            }
        int answer = 0;
        for(int i =0; i<numBer.length; i++){
            answer += numBer[i];
        }
        return answer;
    }
}