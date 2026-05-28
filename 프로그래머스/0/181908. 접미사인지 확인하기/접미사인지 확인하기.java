class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        char[] chAr = my_string.toCharArray();
        char[] chSu = is_suffix.toCharArray();
        int Alen=chAr.length;
        int Slen = chSu.length;
        int i =0;
        
        boolean flag = true;
        
        while(flag){
            if(Alen < Slen) break;
            if(Alen ==0 || Slen == 0) break;
            else{
                if(chAr[Alen-1] == chSu[Slen -1]){
                    flag = true;
                    Alen --;
                    Slen --;
                    answer = 1;
                }else{
                    flag = false;
                    answer =0;
                }
                    i++;
            }
        }
        return answer;
    }
}