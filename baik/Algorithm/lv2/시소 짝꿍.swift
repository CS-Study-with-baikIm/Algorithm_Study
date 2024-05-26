import Foundation

func solution(_ weights:[Int]) -> Int64 {
    
    // 몸무게 - 사람수로 dict에 등록
        // 나눗셈을 정확하게 해야하므로 버림하는 Int가 아니라 Double로
    var dict = [Double:Int]()
    
    for weight in weights {
        dict[Double(weight), default: 0] += 1
    }
    
    var ans = 0
    
    for key in dict.keys {
        if dict[key]! > 1 {
            ans += dict[key]! * (dict[key]! - 1) / 2
        }
        
        if dict[key * 2/3] != nil {
            ans += dict[key]! * dict[key * 2/3]!
        }
        
        
        if dict[key * 2/4] != nil {
            ans += dict[key]! * dict[key * 2/4]!
        }
        
        
        if dict[key * 3/4] != nil {
            ans += dict[key]! * dict[key * 3/4]!
        }
    }
    
    return Int64(ans)
}
