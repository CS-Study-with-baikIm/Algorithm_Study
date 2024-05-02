import Foundation

func solution(_ n:Int, _ computers:[[Int]]) -> Int {
    var arr = Array(repeating: false, count: n)
    var answer:Int = 0
    
    func dfs(_ num:Int) {
        arr[num] = true
        for i in 0..<n {
            if computers[num][i] == 1 && !arr[i] {
                dfs(i)
            }
        }
    }
    
    for i in 0..<n {
        if !arr[i] {
            answer += 1
            dfs(i)
        }
    }
    
    return answer
}
