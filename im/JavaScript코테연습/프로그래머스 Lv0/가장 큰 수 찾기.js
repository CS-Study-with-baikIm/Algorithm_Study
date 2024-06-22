function solution(array) {
    var answer = [array[0], 0];
    let count = 0;
    for(let i of array){
        if(i > answer[0]) {
            answer[0] = i;
            answer[1] = count;
        }
        count++;
    }
    return answer;
}