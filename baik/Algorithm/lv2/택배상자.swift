import Foundation

func solution(_ order:[Int]) -> Int {
    var stack: [Int] = []
    var size: Int = 0
    var count: Int = 0
    
    for i in order {
        if stack.last == i {
            count += 1
            let _ = stack.removeLast()
        } else if size < i {
            count += 1
            for j in size+1..<i {
                stack.append(j)
            }
            size = i
        } else {
            break
        }
    }
    return count
}
