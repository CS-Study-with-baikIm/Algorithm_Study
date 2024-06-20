function solution(my_string) {
    var answer = 0;
    for(let i of my_string){
        if(i >=0 && i <= 9) answer += parseInt(i);
    }
    return answer;
}