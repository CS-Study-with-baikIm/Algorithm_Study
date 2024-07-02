function solution(n) {
    var answer = [];
    n = "" + n;
    for(var i = n.length-1; i>= 0; i--){
        console.log(i);
        answer.push(+n[i]);
    }
    return answer;
}