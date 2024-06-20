function solution(array) {
    const arrSort = array.sort((a, b) => a-b);

    var answer = arrSort[(array.length-1) / 2];
    return answer;
}