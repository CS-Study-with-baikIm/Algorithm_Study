function solution(money) {
    var coffee = Math.floor(money / 5500);
    var answer = [coffee, money - coffee*5500];
    return answer;
}