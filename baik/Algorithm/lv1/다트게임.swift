import Foundation

func solution(_ dartResult:String) -> Int {
    var scores = [Int]()
    var tmpnum = ""
    
    for char in dartResult{
        if "1234567890".contains(char){
            tmpnum += String(char)
        }else{
            if tmpnum != ""{
                scores.append(Int(tmpnum)!)
                tmpnum = ""
            }
        }
        
        var lastidx = scores.count - 1
        
        if char == "S"{        //S면 1제곱
            scores[lastidx] = Int(pow(Double(scores[lastidx]), 1))
        }else if char == "D"{ //D면 2제곱
            scores[lastidx] = Int(pow(Double(scores[lastidx]), 2))
        }else if char == "T"{ //T면 3제곱
            scores[lastidx] = Int(pow(Double(scores[lastidx]), 3))
        }else if char == "*"{ //*상은 현재와 이 전을 두배로
            let beforeidx = lastidx - 1
            if (0...lastidx) ~= beforeidx{
                scores[beforeidx] = scores[beforeidx] * 2
            }
            scores[lastidx] = scores[lastidx] * 2
        }else if char == "#"{ // #상은 현재 점수를 -처리
            scores[lastidx] = scores[lastidx] * -1
        }
    }
    return scores.reduce(0){$0 + $1}
}
