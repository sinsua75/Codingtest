function solution(myString) {
    var answer = [];
    let cnt=0;
    for(let i of myString){
        if(i !== 'x'){
            ++cnt;
        }
        else{ 
            answer.push(cnt);
            cnt = 0;
        }
    }
    answer.push(cnt);
    return answer;
}