class Solution {
    public String[] solution(String[] strArr) {
        for(int i =0; i<strArr.length; i++){
            char[] str = strArr[i].toCharArray();
            for(int j =0; j<strArr[i].length(); j++){
                if(str[j] == 'a'){
                    if(j + 1 < str.length)
                        if(str[j+1] == 'd'){
                            strArr[i] = null;
                            break;
                        }
                }
            }
        }
        int cnt =0;
        for(int i =0; i<strArr.length; i++){
            if(strArr[i] != null) cnt++;
        }
        
        int k =0;
        String[] answer = new String[cnt];
        for(int i =0; i<strArr.length; i++){
            if(strArr[i] != null)
                answer[k++] = strArr[i];
        }
        
        return answer;
    }
}