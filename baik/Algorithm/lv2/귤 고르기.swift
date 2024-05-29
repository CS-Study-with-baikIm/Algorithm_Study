import Foundation

func solution(_ k:Int, _ tangerine:[Int]) -> Int {
    let max = tangerine.max()!
    var arr : [Int] = Array(repeating:0, count: max)
    for i in tangerine {
        arr[i-1] += 1
    }
    
    
    arr.sort(by: >)
    
    var ans = 0
    var count = 0
    for i in arr {
        if count < k {
            count += i
            ans += 1
        } else {
            break
        }
    }
    return ans
}
