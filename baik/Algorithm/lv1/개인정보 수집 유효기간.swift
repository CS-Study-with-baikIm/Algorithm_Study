import Foundation

func solution(_ today:String, _ terms:[String], _ privacies:[String]) -> [Int] {
    var today = today.split(separator: ".").map{Int(String($0))!}
    var dict = [String: Int]()
    var result = [Int]()
    for term in terms {
        let temp = term.split(separator: " ").map{String($0)}
        dict[temp[0]] = Int(temp[1])!
    }
    for (i, privacy) in privacies.enumerated() {
        let p = privacy.split(separator: " ").map{String($0)}
        var day = p[0].split(separator: ".").map{Int(String($0))!}
        
        if day[2] == 1{
            day[2] = 28
            day[1] -= 1
        } else{
            day[2] -= 1
        }
        
        day[1] += dict[p[1]] ?? 0
        
        if day[1] > 12{
            var t = day[1]/12
            t = day[1] % 12 == 0 ? t-1 : t
            day[1] %= 12
            day[1] = day[1] == 0 ? 12 : day[1]
            day[0] += t
        }
        
        if day[0] < today[0] {result.append(i+1)}
        else if day[0] == today[0]{
            if day[1] < today[1]{result.append(i+1)}
            else if day[1] == today[1] {
                if day[2] < today[2]{result.append(i+1)}
            }
        }
    }
    
    return result

}


// DateFormatter 를 이용한 풀이
func solution(_ today: String, _ terms: [String], _ privacies: [String]) -> [Int] {
    var answer: [Int] = []

    let formatter = DateFormatter()
    formatter.dateFormat = "YYYY.MM.dd"

    let today = formatter.date(from: today)!
    var termsDict: [String: Int] = [:]

    terms.forEach { term in
        let split = term.split(separator: " ").map { String($0) }
        termsDict[split[0]] = Int(split[1])!
    }

    for (i, privacy) in privacies.enumerated() {
        let split = privacy.split(separator: " ").map { String($0) }

        guard let date = formatter.date(from: split[0]),
              let term = termsDict[split[1]] else {
            continue
        }

        let month = DateComponents(month: term)
        let expiration = Calendar.current.date(byAdding: month, to: date)!

        if today >= expiration {
            answer.append(i + 1)
        }
    }

    return answer
}
