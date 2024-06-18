//
//  크레인 인형뽑기.swift
//  Algorithm
//
//  Created by jonghyun baik on 6/18/24.
//

import Foundation

func solution(_ board:[[Int]], _ moves:[Int]) -> Int {
    var count = 0
    var stack: [[Int]] = Array(repeating: [], count: board.count)
    var basket: [Int] = []

    for row in board.reversed() {
        for (col, doll) in row.enumerated() {
            
            if doll != 0 {
                stack[col].append(doll)
            }
        }
    }

    for move in moves {
        if let doll = stack[move-1].popLast() {
            if let last = basket.last, last == doll {
                basket.removeLast()
                count += 2
                continue
            }
            basket.append(doll)
        }
    }

    return count
}
 
