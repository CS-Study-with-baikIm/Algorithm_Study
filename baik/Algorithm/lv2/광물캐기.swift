import Foundation

func solution(_ picks:[Int], _ minerals:[String]) -> Int {
    
    var result = Int.max
    
    var pickCost = [
        "diamond": [1, 5, 25],
        "iron": [1, 1, 5],
        "stone": [1, 1, 1]
    ]
    
    
    func dfs(picks: [Int], now: Int, cost: Int) {
        if now == minerals.count || picks.reduce(0, +) == 0 {
            result = min(result, cost)
            return
        }
        
        // 곡괭이를 3종류 순회
        for i in 0..<3 {
            // 곡괭이가 남아 있다면
            if picks[i] > 0 {
                // 곡괭이 -1
                var newPicks = picks
                newPicks[i] -= 1
                var newCost = cost
                var now = now
                for _ in 0..<5 {
                    if now == minerals.count { break }
                    newCost += pickCost[minerals[now]]![i]
                    now += 1
                }
                dfs(picks: newPicks, now: now, cost: newCost)
            }
        }
    }
    
    dfs(picks: picks, now: 0, cost: 0)
    
    return result
}
