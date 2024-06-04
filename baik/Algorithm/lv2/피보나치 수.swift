//func solution(_ n:Int) -> Int {
//    return fiv(n) % 1234567
//}
//
//func fiv(_ n:Int) -> Int {
//    if n < 2 {
//        return n
//    }
//    else {
//        return fiv(n-1) + fiv(n-2)
//    }
//}

// 위 방식으로 재귀로 풀 경우 시간초과 발생

func solution(_ n:Int) -> Int {
  var fibonacci: [Int] = [0, 1]
  
  for i in 2...n {
    fibonacci.append((fibonacci[i-2] + fibonacci[i-1]) % 1234567)
  }
  
  return fibonacci[n]
}
