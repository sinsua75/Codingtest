function solution(arr, flag) {
    var answer = [];
    let x = []
    for(let i = 0; i < arr.length; i++){
        if(flag[i] === true){
            let j =0;
            while(arr[i]*2 > j ){
                x.push(arr[i]);
                j++;
            }
        }
        else{
            let j =0;
            while(arr[i] > j){
                x.pop();
                j++;
            }
        }
    }
    
    
    return x;
}