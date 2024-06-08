//
//  멀리뛰기.swift
//  Algorithm
//
//  Created by jonghyun baik on 6/5/24.
//

import Foundation

func solution(_ n:Int) -> Int {
  var fibonacci: [Int] = [0, 1]
  
  for i in 2...n {
    fibonacci.append((fibonacci[i-2] + fibonacci[i-1]) % 1234567)
  }
  
  return fibonacci[n]
}
