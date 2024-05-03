import Foundation

func solution(_ friends:[String], _ gifts:[String]) -> Int {
    var gift: [[String]] = []
    var dict: [String: Int] = [:]
    var receive: [Int] = Array(repeating:0, count: friends.count)
    for who in gifts {
        gift.append(who.components(separatedBy: " "))
    }
    for i in friends {
        dict[i] = 0
    }
    for g in gift {
        dict[g[0], default: 0] += 1
        dict[g[1], default: 0] -= 1
    }
    
    for i in 0..<friends.count {
        for j in i+1..<friends.count {
            if (gift.filter { g in
                g[0] == friends[i] && g[1] == friends[j]
            }.count > gift.filter { g in
                g[1] == friends[i] && g[0] == friends[j]
            }.count) {
                receive[i] += 1
            } else if (gift.filter { g in
                g[0] == friends[i] && g[1] == friends[j]
            }.count == gift.filter { g in
                g[1] == friends[i] && g[0] == friends[j]
            }.count) {
                if dict[friends[i], default: 0] > dict[friends[j], default: 0] {
                    receive[i] += 1
                } else if dict[friends[i], default: 0] < dict[friends[j], default: 0]  {
                    receive[j] += 1
                }
            } else if (gift.filter { g in
                g[0] == friends[i] && g[1] == friends[j]
            }.count < gift.filter { g in
                g[1] == friends[i] && g[0] == friends[j]
            }.count) {
                receive[j] += 1
            }
        }
    }
    return receive.max()!
}
