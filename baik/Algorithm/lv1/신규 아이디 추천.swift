import Foundation

func solution(_ new_id:String) -> String {
    var id = new_id
    id = id.lowercased()
    var str: [Character] = []
    var arr = Array(id)
    let possible = "0123456789abcdefghijklmnopqrstuvwxyz-_."

    for i in 0..<arr.count {
        if possible.contains(arr[i]) {
            str.append(arr[i])
        }
    }
    id = String(str)

    while id.contains("..") {
        id = id.replacingOccurrences(of: "..", with: ".")
    }

    str = Array(id)

    if str[0] == "." {
        str.remove(at: 0)
    }

    if str.count == 0 {
        str.append("a")
    }

    while str.count >= 16 {
        str.remove(at: str.count-1)
    }
    
    if str[str.count-1] == "." {
        str.remove(at: str.count-1)
    }

    if str.count <= 2 {
        while str.count != 3 {
            str.append(str[str.count-1])
        }
    }
    return String(str)
}
