function solution(a, b) {
    var answer = 0;
    if(a > b) {
        var tmp = a;
        a = b;
        b= tmp;
    }

    if(a == b) return a;
    else{
        for(var i = a; i <=b; i++){
            answer += i;
        }
        return answer;
    }
}