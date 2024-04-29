import Foundation

func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    return commands.map { array[$0[0]-1...$0[1]-1].sorted(by: < )[$0[2]-1] }
}

// 알고리즘은 쉬웠지만 한줄코드로 만들기 위해 많은 고민을 함
