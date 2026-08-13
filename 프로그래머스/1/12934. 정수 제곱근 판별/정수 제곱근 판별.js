function solution(n) {
    var answer = 0;
    const sqrt = Math.sqrt(n);
    if (Number.isInteger(sqrt) && sqrt > 0) {
        answer = (sqrt+1) * (sqrt+1);
    } else {
        answer = -1;
    }
    return answer;
}