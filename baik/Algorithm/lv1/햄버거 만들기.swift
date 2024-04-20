import Foundation

func solution(_ ingredient:[Int]) -> Int {
    var stack : [Int] = []
    var answer = 0
    for i in ingredient {
        stack.append(i)
        var n = stack.count
        if stack.count < 4 { continue }
        else if Array(stack[(n-4)..<n]) == [1,2,3,1] {
            answer += 1
            stack.removeLast(4)
        }
    }
    return answer
}

/*
 stack 으로 해결
 
 stack.removeLast(4) 이부분에 경우 stack = Array(stack[0..<(n-4)]) 으로도 해결 가능하지만
 시간이 더 오래걸리는 것 같아 removeLast 로 해결
 
*/
