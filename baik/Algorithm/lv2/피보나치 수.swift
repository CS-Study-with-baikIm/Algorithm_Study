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
    var fibonacci: [Int] = [1, 2]
    var i = 0
    while fibonacci.count < n {
        fibonacci.append((fibonacci[i] + fibonacci[i+1]) % 1234567)
        i += 1
    }
  
    return fibonacci[n-1]
}


// 멀리뛰기 알고리즘을 짜던중 n에 따라 피보나치로 증가함을 확인함
