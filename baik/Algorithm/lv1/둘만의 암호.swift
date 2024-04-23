import Foundation

func solution(_ s:String, _ skip:String, _ index:Int) -> String {
    var answer = ""
    
    let alphabet = "abcdefghijklmnopqrstuvwxyz".map { String($0) }
    var s = s.map { String($0) }
    
    
    for i in 0..<s.count {
        if var c = alphabet.firstIndex(of: s[i]) {
            var index = index
            
            while index != 0 {
                c += 1
                c %= 26
                
                if skip.contains(alphabet[c]) { continue }
                
                index -= 1
                s[i] = alphabet[c]
            }
        }
    }
    
    return s.joined()
}

/*
생각보다 굉장히 어렵게 푼 문제
처음엔 쉬울줄 알고 접근했으나...
잘못된 접근으로 한번 날려먹고 이후에도 String 과 String.Element(Character) 변환의 문제로 어려움을 겪었다.
*/
