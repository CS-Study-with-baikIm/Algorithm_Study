import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var ans = Array(repeating: -1, count: numbers.count)
    var stack: [(Int, Int)] = [(0, numbers[0])]
    
    for i in 1..<numbers.count {
        
        while !stack.isEmpty {
            
            if stack.last!.1 >= numbers[i] { break }
            ans[stack.removeLast().0] = numbers[i]
        }
        
        stack.append((i, numbers[i]))
    }
    
    return ans
}
