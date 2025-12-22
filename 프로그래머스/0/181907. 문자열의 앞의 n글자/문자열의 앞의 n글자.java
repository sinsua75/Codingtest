class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] arr1= new char[n];
        for(int i=0; i<n; i++){
            arr1[i]=arr[i];
        }
        answer = new String(arr1);
        return answer;
    }
}