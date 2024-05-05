import Foundation

func solution(_ n:Int) -> Int {
    let count = String(n, radix: 2).filter{$0 == "1"}.count
    var answer = n
    while true {
        answer += 1
        if String(answer, radix: 2).filter{$0 == "1"}.count == count {
            break
        }
    }
    return answer
}

// nonzeroBitCount 이용한 풀이
// nonzeroBitCount 프로퍼티는 Int 타입으로 이진 표현에서 1의 비트 수를 출력해주는 것
func solution(_ n:Int) -> Int {
    var answer = n
    while true {
        answer += 1
        if n.nonzeroBitCount == answer.nonzeroBitCount {
            break
        }
    }
    
    return answer
}

//시간이 엄청나게 줄어든다.
