function solution(my_strings, parts) {
    var answer = '';
    for(let i = 0; i< parts.length; i++){
        let arr = parts[i];
        let result =[];
        answer += my_strings[i].slice(arr[0], arr[1]+1);
        
    }
    return answer;
}