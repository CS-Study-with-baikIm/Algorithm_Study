import Foundation

func solution(_ targets:[[Int]]) -> Int {

    let targets = targets.sorted { t1, t2 in
        if t1[1] == t2[1] {
            return t1[0] < t2[0]
        } else {
            return t1[1] < t2[1]
        }
    }

    var ans = 0
    var nowEnd = 0
    
    for target in targets {
        if target[0] >= nowEnd {
            ans += 1
            nowEnd = target[1]
        }
    }

    return ans
}

