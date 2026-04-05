class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            int temp = num;

            // 숫자 0일 때 처리
            if (temp == 0 && k == 0) {
                answer++;
            }

            while (temp > 0) {
                if (temp % 10 == k) {
                    answer++;
                }
                temp /= 10;
            }
        }

        return answer;
    }
}