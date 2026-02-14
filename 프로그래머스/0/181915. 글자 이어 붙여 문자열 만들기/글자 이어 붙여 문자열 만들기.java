class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] ch = my_string.toCharArray();
        char[] Answer = new char[index_list.length];
        for(int i =0; i<index_list.length; i++){
            Answer[i] = ch[index_list[i]];
        }
        String answer = new String(Answer);
        return answer;
    }
}