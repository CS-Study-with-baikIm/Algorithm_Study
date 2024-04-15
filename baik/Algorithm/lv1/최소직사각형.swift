import Foundation

func solution(_ sizes:[[Int]]) -> Int {
    var arrS : [[Int]] = [[],[]]
    
    for i in sizes {
        arrS[0].append(i.min()!)
        arrS[1].append(i.max()!)
    }
    
    return arrS[0].max()! * arrS[1].max()!
}

/*
 완전 탐색 문제
 작은수들의 최대값과 큰 수들의 최대값을 구해 곱함
 */
