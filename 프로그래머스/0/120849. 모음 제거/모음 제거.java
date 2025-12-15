class Solution {
    public String solution(String my_string) {
        int n=0;
        
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<my_string.length(); i++){
            if(arr[i]=='a'|| arr[i]== 'e' || arr[i]== 'i'
              || arr[i]== 'o'|| arr[i]== 'u'){
                n++;
            }
        }
        
        char[] ch = new char[my_string.length()-n];
        int temp=0;
        
        for(int i=0; i<my_string.length(); i++){
                if(arr[i]=='a'|| arr[i]== 'e' || arr[i]== 'i'
                || arr[i]== 'o'|| arr[i]== 'u'){
                    continue;
                }
                ch[temp++]= arr[i];
            
        }
        
        
        String answer = new String(ch);
        return answer;
    }
}