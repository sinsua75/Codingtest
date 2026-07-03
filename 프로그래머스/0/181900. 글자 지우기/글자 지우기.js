function solution(my_string, indices) {
    let MS = my_string.split("");
    
    // 2. 현재 인덱스가 indices 배열에 "포함되지 않은" 것만 남깁니다.
    const answer = MS.filter((ms, index) => {
        return !indices.includes(index);
    });
    
    return answer.join("");
}