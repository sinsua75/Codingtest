class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            a += arr[i];        
        }

        int[] answer = new int[a];
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            for(int s = 0; s < arr[i]; s++){   
                answer[j++] = arr[i];
            }
        }

        return answer;
    }
}
