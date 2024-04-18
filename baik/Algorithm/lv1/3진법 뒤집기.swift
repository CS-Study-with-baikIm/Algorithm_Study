import Foundation

func solution(_ n:Int) -> Int {
    var tmp = n
    var int3 : String = ""
    for i in 0... {
        if tmp > 0 {
            int3 += String(tmp % 3)
            tmp = tmp / 3
        } else {
            break
        }
    }
    tmp = 0
    var mul = 1
    for i in int3.reversed() {
        tmp += Int(String(i))! * mul
        mul *= 3
    }
    return tmp
}
