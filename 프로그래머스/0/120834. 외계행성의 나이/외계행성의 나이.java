class Solution {
    public String solution(int age) {
        String stAge = Integer.toString(age);
        char[] chAge = stAge.toCharArray();
        char[] chAnswer = new char[chAge.length];
        int num =0;
        for(int i =0; i<chAge.length; i++){
            if(chAge[i] == '0') chAnswer[num++]= 'a';
            else if(chAge[i] == '1') chAnswer[num++] = 'b';
            else if(chAge[i] == '2') chAnswer[num++] = 'c';
            else if(chAge[i] == '3') chAnswer[num++] = 'd';
            else if(chAge[i] == '4') chAnswer[num++] = 'e';
            else if(chAge[i] == '5') chAnswer[num++] = 'f';
            else if(chAge[i] == '6') chAnswer[num++] = 'g';
            else if(chAge[i] == '7') chAnswer[num++] = 'h';
            else if(chAge[i] == '8') chAnswer[num++] = 'i';
            else if(chAge[i] == '9') chAnswer[num++] = 'j';
        }
        
        
        String answer = new String(chAnswer);
        return answer;
    }
}