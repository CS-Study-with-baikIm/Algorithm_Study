function solution(str_list, ex) {
    var answer = '';
    for(let s of str_list){
        if(!s.includes(ex)) answer += s;
    }
    return answer;
}