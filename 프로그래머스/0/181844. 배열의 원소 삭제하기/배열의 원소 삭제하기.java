class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt =0;
        for(int i =0; i< delete_list.length; i++)
            for(int j=0; j< arr.length; j++ ){
                if(arr[j] == delete_list[i]){
                    cnt++;
                    arr[j] = 0;
                }
            }
        int[] answer = new int[arr.length - cnt];
        int num =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
                answer[num++] = arr[i];
            }
        }
        
        return answer;
    }
}