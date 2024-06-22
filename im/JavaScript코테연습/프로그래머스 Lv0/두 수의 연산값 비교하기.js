function solution(a, b) {
    let f = ''+a+b;
    let s = 2*a*b;
    return f > s ? +f : s;
}