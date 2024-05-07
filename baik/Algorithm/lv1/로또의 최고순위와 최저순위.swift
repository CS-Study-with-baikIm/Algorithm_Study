import Foundation

func solution(_ lottos:[Int], _ win_nums:[Int]) -> [Int] {
    return [min(7-lottos.filter { win_nums.contains($0) }.count-lottos.filter { $0  == 0 }.count,6), min(7-lottos.filter { win_nums.contains($0) }.count,6)]
}

// 이 문제는 한줄 코드를 위해 위처럼 한것이지 실제론 아래와 같이 푸는것이 고차함수 연산이 1회 줄기에 효율적이다. 

func solution(_ lottos:[Int], _ win_nums:[Int]) -> [Int] {

    let zeroCount = lottos.filter { $0 == 0}.count
    let winCount: Int = win_nums.filter { lottos.contains($0) }.count


    return [min(7-winCount-zeroCount,6), min(7-winCount,6)]
}
