import Foundation

func solution(_ n:Int, _ m:Int, _ section:[Int]) -> Int {
    var ans = 0
    var wall = 0
    for i in section {
        if i < wall {
            continue
        } else {
            wall = i + m
            ans += 1
        }
    }
    return ans
}

/*
 해결 로직을 생각해 내는데 꽤나 시간을 소요함
 하지만 문제 자체가 쉽고 생각해낸 로직을 구현하기에는 쉬웠음.
 */
