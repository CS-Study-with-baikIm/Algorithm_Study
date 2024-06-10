//
//  예산.swift
//  Algorithm
//
//  Created by jonghyun baik on 6/10/24.
//

import Foundation

func solution(_ d:[Int], _ budget:Int) -> Int {
  var sum = 0
  var count = 0
  
  for i in d.sorted() {
    sum += i
    guard sum <= budget else { break }
    count += 1
  }
  
  return count
}
