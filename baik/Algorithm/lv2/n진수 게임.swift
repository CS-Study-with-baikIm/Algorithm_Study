func solution(_ n:Int, _ t:Int, _ m:Int, _ p:Int) -> String {
    var ans = ""
    var t = t
    var k = 0
    // 0부터 숫자를 차례대로 표현
    var order = 1
    // 현재 순서를 표현
    while t > 0 {
        let num = String(k, radix: n).uppercased()
        // k숫자를 n진법의 수로 변환 후 대문자화
        for ch in num {
            //현재 본인 순서일때 문자 입력 후 구할 숫자의 개수 -1
                if order == p {
                    ans += String(ch)
                    t -= 1
                }
            // 순서가 m일경우 초기화
                if order == m {
                    order = 0
                }
                if t == 0 {
                    break
                }
                order += 1
        }
        k += 1
    }
    return ans
}
