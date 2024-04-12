import Foundation

func solution(_ name:[String], _ yearning:[Int], _ photo:[[String]]) -> [Int] {
    var dict: [String:Int] = Dictionary(uniqueKeysWithValues: zip(name, yearning))
    return photo.map { $0.reduce(0) {$0 + (dict[$1] ?? 0)}}
}

/*
 위 문제의 경우 dictionary 로 이름과 점수를 재정리하고 이를 대입하여 푸는 문제
 
 dictionary 와 map, reduce를 사용하여 문제 해결
 */
