import Foundation

func solution(sequence:[Int], k:Int) -> [Int] {
    var sum = sequence[0]
    var p1 = 0
    var p2 = 0
    var ans: [[Int]] = []
    
    while p1 < sequence.count && p2 < sequence.count {
        if sum == k {
            ans.append([p1, p2])
        }
        
        if sum <= k {
            p2 += 1
            if p2 == sequence.count { break }
            sum += sequence[p2]
        } else {
            sum -= sequence[p1]
            p1 += 1
        }
    }
    
    ans = ans.sorted(by: {
        if $0[1] - $0[0] == $1[1] - $1[0] {
            return $0[0] < $1[0]
        } else {
            return $0[1] - $0[0] < $1[1] - $1[0]
        }
    })
    
    return ans.isEmpty ? [] : ans[0]
}
