class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] arr = rsp.toCharArray();
        char[] arrAnswer = new char[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='2'){
                arrAnswer[i]='0';
            }
            else if(arr[i]=='5'){
                arrAnswer[i]='2';
            }
            else{
                arrAnswer[i]='5';
            }
        }
        
        answer = new String(arrAnswer);
        return answer;
    }
}