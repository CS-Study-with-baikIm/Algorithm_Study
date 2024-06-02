import Foundation

func solution(_ data:[[Int]], _ col:Int, _ row_begin:Int, _ row_end:Int) -> Int {
    var sorted = data.sorted{
        if $0[col-1] < $1[col-1] {
            return true
        } else if  $0[col-1] == $1[col-1] {
            if $0[0] > $1[0] {
                return true
            } else {
                return false
            }
        } else {
            return false
        }
    }
    var result:Int = 0
    for i in row_begin-1...row_end-1 {
        var sum:Int = 0
        for j in sorted[i] {
            sum += j%(i+1)
        }
        result = result^sum
    }
    return result
}
