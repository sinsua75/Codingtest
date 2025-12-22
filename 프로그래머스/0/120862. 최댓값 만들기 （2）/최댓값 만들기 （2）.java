class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length -1; i++)
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j]> numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=temp;
                    
                }
            }
        
        int a = numbers[numbers.length-1]*numbers[numbers.length-2];
        int b = numbers[0]*numbers[1];
        
        if(a>=b){
            answer=a;
        }
        else if(a<b){
            answer =b;
        }
        return answer;
    }
}