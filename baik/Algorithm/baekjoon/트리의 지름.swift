import Foundation

let V = Int(readLine()!)!
var tree = Array(repeating: [(Int,Int)](), count: V+1)

for _ in 1...V {
    let arr = readLine()!.split(separator:" ").map{Int(String($0))!}
    var idx = 1
    while true {
        if arr[idx] == -1 { break }
        tree[arr[0]].append((arr[idx],arr[idx+1]))
        idx += 2
    }
}

var visited = Array(repeating: false, count: V+1)
var finalNode = 0
var length = 0

func dfs(_ node: Int, _ depth: Int) {
    visited[node] = true
    
    if length < depth {
        length = depth
        finalNode = node
    }
    
    for i in tree[node] {
        if !visited[i.0] {
            dfs(i.0, depth + i.1)
        }
    }
}

dfs(1,0)
length = 0
visited = Array(repeating: false, count: V+1)
dfs(finalNode,0)

print(length)
