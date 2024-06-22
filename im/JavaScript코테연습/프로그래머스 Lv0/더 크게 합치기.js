function solution(a, b) {
    let f = ''+a+b;
    let s = ''+b+a;
    return +f > +s ? +f : +s;
}