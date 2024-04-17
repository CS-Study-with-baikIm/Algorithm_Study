

import Foundation

func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    var students = Array(repeating: 1, count: n+2)
    students[0] = 0
    students[n+1] = 0
    
    for i in 1...n {
        if reserve.contains(i) {
            students[i] += 1
        }
        if lost.contains(i) {
            students[i] -= 1
        }
    }

    for i in 1...n where students[i] == 0 {
        if students[i-1] == 2 {
            students[i-1] = 1
            students[i] = 1
            continue
        }
        
        if students[i+1] == 2 {
            students[i+1] = 1
            students[i] = 1
        }
    }
    
    return students.filter{$0 != 0}.count
}


/*
 Greedy 알고리즘 문제
 */
