function solution(numbers) {
    var answer = 0;
    numbers.forEach((i) =>{
        answer+=i;
    })
    return answer/numbers.length;
}