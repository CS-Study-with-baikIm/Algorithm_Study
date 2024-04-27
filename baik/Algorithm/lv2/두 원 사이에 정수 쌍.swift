import Foundation

func solution(_ r1:Int, _ r2:Int) -> Int64 {
    let dr1 = Double(r1)
    let dr2 = Double(r2)

    var result = 0.0

    for x in 1...r2 {
        let dx = Double(x)
        
        //sqrt는 제곱근 함수 , pow는 제곱 함수
        let y1 = dr1 - dx > 0 ? sqrt(pow(dr1, 2) - pow(dx, 2)) : 0
        
        let y2 = sqrt(pow(dr2, 2) - pow(dx, 2))
        
        //floor는 소수점 내림 함수, ceil은 소수점 올림 함수
        result += floor(y2) - (ceil(y1) - 1)
    }

    return Int64(result * 4)
}
