function solution(n) {
    var answer = 0;
    let arr= [];
    n = n.toString();
    for(let x of n){
        arr.push(x);
    }
    answer = arr.sort((a,b) => {return b-a;});
    return Number(answer.join(""));
}