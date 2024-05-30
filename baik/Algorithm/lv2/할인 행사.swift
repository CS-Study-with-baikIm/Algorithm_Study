import Foundation

func solution(_ want:[String], _ number:[Int], _ discount:[String]) -> Int {
    var ans = 0
    
    for i in 0...discount.count - 10 {
        var dc = discount[i...i+9]
        
        var member = true
        for j in 0..<want.count {
            if dc.filter {$0 == want[j]}.count != number[j] {
                member = false
                break
            }
        }
        if member == true {
            ans += 1
        }
    }
    return ans
}
