function solution(num_list) {
    var answer = 0;
    let h = '';
    let j = '';
    for(let i of num_list){
        if(i % 2 == 0) h += i;
        else j += i;
    }
    return +h + +j;
}