function solution(num_list) {
    let h = 0;
    let g = 1;
    for(let i of num_list){
        h += i;
        g *= i;
    }
    return h**2 > g ? 1: 0;
}