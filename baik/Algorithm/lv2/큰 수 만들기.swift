import Foundation

func solution(_ number:String, _ k:Int) -> String {
    let numArr = number.map{ Int(String($0))! }
    var answer = [Int]()
    var temp = k

    for i in 0..<number.count {
        
        while temp > 0, !answer.isEmpty, answer.last! < numArr[i] {
            answer.removeLast()
            temp -= 1
        }

        if temp <= 0 {
            answer.append(contentsOf: numArr[i...])
            break
        } else {
            answer.append(numArr[i])
        }
    }

    return String(answer.map{ String($0) }.joined().prefix(number.count-k))
}
