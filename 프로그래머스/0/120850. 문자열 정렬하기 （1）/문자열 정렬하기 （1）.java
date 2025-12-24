class Solution {
    public int[] solution(String my_string) {
        int num = 0;
        for (int j = 0; j < my_string.length(); j++) {
            char c = my_string.charAt(j);

            if (Character.isDigit(c)) {
                num += 1;
            }
        }
        
        
        int[] answer = new int[num];
        int i =0;
        
            for(int j =0; j< my_string.length(); j++){
                char c = my_string.charAt(j);

                if (Character.isDigit(c)) {
                    answer[i++]=c-'0';
                }
            }
        
        for(int s=0; s<answer.length-1; s++)
            for(int j=0; j<answer.length-1-s; j++){
                if(answer[j]>answer[j+1]){
                    int temp =answer[j+1];
                    answer[j+1] = answer[j];
                    answer[j] = temp;
                }
            }

        return answer;
    }
}