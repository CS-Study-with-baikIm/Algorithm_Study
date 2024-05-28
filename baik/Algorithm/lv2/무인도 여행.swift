import Foundation

func solution(_ maps:[String]) -> [Int] {
    
    let dr = [1, -1, 0, 0]
    let dc = [0, 0, 1, -1]
    
    func isValid(_ r: Int, c: Int) -> Bool {
        (0..<maps.count).contains(r) && (0..<maps[0].count).contains(c)
    }
    
    var ans = [Int]()
    var visited = Array(repeating: Array(repeating: false, count: maps[0].count), count: maps.count)
    let maps = maps.map { $0.map { String($0) } }
    
    
    func dfs(_ r: Int, _ c: Int) -> Int {
        
        visited[r][c] = true
        var food = Int(maps[r][c])!
        
        for i in 0..<4 {
            let nr = r + dr[i]
            let nc = c + dc[i]
            if isValid(nr, c: nc) && maps[nr][nc] != "X" && !visited[nr][nc] {
                
                food += dfs(nr, nc)
            }
        }
        
        
        return food
        
    }
    
    for r in 0..<maps.count {
        for c in 0..<maps[0].count {
            if maps[r][c] != "X" && !visited[r][c] {
                ans.append(dfs(r, c))
            }
        }
    }
    
    return !ans.isEmpty ? ans.sorted() : [-1]
}
