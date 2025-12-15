class Solution {
    public String solution(String my_string, int n) {
        char[] arr = my_string.toCharArray();
        char[] ch = new char[n*arr.length];
        
        int temp =0;
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<n; j++)
                ch[temp++] = arr[i];
        
        String answer = new String(ch);
        return answer;
    }
}