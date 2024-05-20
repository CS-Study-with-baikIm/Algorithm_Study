import Foundation

func solution(_ x:Int, _ y:Int, _ n:Int) -> Int {
    
    var arr = Set([x])
    var result = 0
    
    while true{
        var temp = Set<Int>()
        
        if arr.contains(y){
            return result
        }
        for i in arr{
            if i + n <= y{
                temp.insert(i + n)
            }
            if i * 2 <= y{
                temp.insert(i * 2)
            }
            if i * 3 <= y{
                temp.insert(i * 3)
            }
        }
        
        if temp.isEmpty{
           return -1
        } else {
            arr = temp
            result += 1
        }
    }
    
    return result
}
