import Foundation

func solution(_ n:Int) -> [[Int]] {
    var hanoiArray: [[Int]] = []
    
        func hanoi(_ n: Int, _ from: Int, _ by: Int, _ to: Int) -> [[Int]] {
            
            if n == 1 {
                hanoiArray.append([from,to])
                
            } else {
                
                hanoi(n-1, from,to,by)
                hanoiArray.append([from,to])
            
                hanoi(n-1, by,from,to)
                print("return \n")
            }
        return hanoiArray
        }

    return hanoi(n,1,2,3)
}
