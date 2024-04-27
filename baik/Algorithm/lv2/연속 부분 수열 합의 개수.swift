import Foundation

func solution(_ elements:[Int]) -> Int {
    var result = Set<Int>()
    //set 을 이용하여 중복을 제거한다.
    
    for i in 0..<elements.count{
        var num = 0
        for j in 0..<elements.count{
            num += elements[(i+j) % elements.count]
            result.insert(num)
        }
    }
    return result.count
}
