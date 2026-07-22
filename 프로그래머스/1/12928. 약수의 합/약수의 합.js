function solution(n) {
    var answer = 0;
    let count =1;
    let sum =0;
    while(count <= n){
        if(n % count == 0 ) sum += count;
        count++;
    }
    answer = sum;
    return answer;
}