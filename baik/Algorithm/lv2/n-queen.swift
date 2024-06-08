import Foundation

func solution(_ n:Int) -> Int {
    
    var chess = Array(repeating: -1, count: n)
    var answer = 0
    
    func checkArrangeQueen(row: Int) -> Bool {
        for i in 0..<row {
            if chess[i] == chess[row] || abs(chess[row] - chess[i]) == abs(row - i) {
                return false
            }
        }
        
        return true
    }
    
    
    func dfs(row: Int) {
        
        if row == n {
            answer += 1
            return
        }
        
        for i in 0..<n {
            chess[row] = i
            
            if checkArrangeQueen(row: row) {
                dfs(row: row + 1)
            }
        }
    }
    
    dfs(row: 0)
    
    return answer
}
