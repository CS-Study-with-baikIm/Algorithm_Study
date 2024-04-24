import Foundation

func solution(_ answers:[Int]) -> [Int] {
    var a = [1,2,3,4,5]
    var b = [2,1,2,3,2,4,2,5]
    var c = [3,3,1,1,2,2,4,4,5,5]
    var correct: [Int] = [0,0,0]
    for i in 0..<answers.count {
        if answers[i] == a[i%5] {
            correct[0] += 1
        }
        if answers[i] == b[i%8] {
            correct[1] += 1
        }
        if answers[i] == c[i%10] {
            correct[2] += 1
        }
    }
    var ans : [Int] = []
    for i in 0..<correct.count {
        if correct.max()! == correct[i] {
            ans.append(i+1)
        }
    }
    
    return ans
}


/*
 다른사람의 풀이
 
 func solution(_ answers:[Int]) -> [Int] {
     let answer = (
         a: [1, 2, 3, 4, 5], // index % 5
         b: [2, 1, 2, 3, 2, 4, 2, 5], // index % 8
         c: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] // index % 10
     )
     var point = [1:0, 2:0, 3:0]

     for (i, v) in answers.enumerated() {
         if v == answer.a[i % 5] { point[1] = point[1]! + 1 }
         if v == answer.b[i % 8] { point[2] = point[2]! + 1 }
         if v == answer.c[i % 10] { point[3] = point[3]! + 1 }
     }

     return point.sorted{ $0.key < $1.key }.filter{ $0.value == point.values.max() }.map{ $0.key }
 }
 
 딕셔너리와 고차함수를 이용한 매우 심플한 코드
 */
