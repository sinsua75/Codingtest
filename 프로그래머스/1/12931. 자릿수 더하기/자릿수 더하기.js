function solution(n)
{
    var answer = 0;

    let arr = String(n).split("");

    for(let x of arr){
        answer += Number(x);
    }

    return answer;
}