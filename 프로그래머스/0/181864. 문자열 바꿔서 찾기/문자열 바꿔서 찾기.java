class Solution {
    public int solution(String myString, String pat) {
        char[] ch = myString.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') ch[i] = 'B';
            else if (ch[i] == 'B') ch[i] = 'A';
        }

        String changed = new String(ch);

        if (changed.contains(pat)) return 1;
        return 0;
    }
}
