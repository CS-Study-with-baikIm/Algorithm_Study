import Foundation

func solution(_ N:Int, _ stages:[Int]) -> [Int] {
    var failure = [Int: Double]()
    var total = Double(stages.count)
    var countArr = Array(repeating: 0, count: N+2)
    // N+2 까지 만들어주는 이유는 인덱스와 스테이지 번호를 일치 시키기 위함이다.
    
    for num in stages {
        countArr[num] += 1
    }
    // 각 스테이지 사람의 수를 구함
    
    for i in 1...N {
        if countArr[i] == 0 {
            failure[i] = 0.0
        } else {
            total = total - Double(countArr[i])
            // 전체에서 각 스테이지 사람수를 빼면서 현재스테이지 이상의 사람의 수를 구함.
            failure[i] = Double(countArr[i]) / total
        }
    }
    
    return failure.sorted(by: { $0.0 < $1.0}).sorted(by: { $0.1 > $1.1 }).map{ $0.key }
}

// 아래의 문제로 해결하려 했으나 filter 부분에서 시간초과 발생
// filter의 시간복잡도가 O(n^2) 이기에 for문까지 총 O(n^3)의 시간이 발생하므로 이 부분에서 시간초과 출력된 것

//func solution(_ N:Int, _ stages:[Int]) -> [Int] {
//    var dict : [Int: Double] = [:]
//    for i in 1...N {
//        if stages.filter {$0 >= i}.count > 0 {
//            dict[i] = Double(stages.filter {$0 == i}.count) / Double(stages.filter {$0 >= i}.count)
//        } else {
//            dict[i] = 0
//        }
//    }
//    let sortedDictionary = dict.sorted { (first, second) in
//                        if first.value == second.value {
//                            return first.key < second.key
//                        }
//                        return first.value > second.value }
//    return sortedDictionary.map {$0.key}
//    return [1]
//}

