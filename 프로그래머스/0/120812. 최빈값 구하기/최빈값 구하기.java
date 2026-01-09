class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            int num = 0; // ⭐ 여기서 초기화

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    num++;
                }
            }

            if (num > max) {
                max = num;
                answer = array[i]; // ⭐ 값 저장
            } else if (num == max && answer != array[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}
