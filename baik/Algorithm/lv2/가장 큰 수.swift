//
//  가장 큰 수.swift
//  Algorithm
//
//  Created by jonghyun baik on 6/9/24.
//

import Foundation

func solution(_ numbers:[Int]) -> String {
    let sorted : [Int] = numbers.sorted { Int("\($0)\($1)")! > Int("\($1)\($0)")!}
    if sorted[0] == 0 {
        return "0"
    }
    return sorted.reduce("") { $0 + "\($1)"}
}
