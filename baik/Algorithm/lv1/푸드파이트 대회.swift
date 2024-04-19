import Foundation

func solution(_ food:[Int]) -> String {
    var answer = ""
    var num = 0
    for i in food {
        for j in 0..<i/2 {
            answer += String(num)
        }
        num += 1
    }
    return answer + "0" + answer.reversed()
}
