function solution(a, b) {
    var answer = 0;
    let ab = String(a)+String(b);
    let ba = String(b)+String(a);
    if(+ab > +ba) answer = +ab;
    else answer = +ba;
    return answer;
}