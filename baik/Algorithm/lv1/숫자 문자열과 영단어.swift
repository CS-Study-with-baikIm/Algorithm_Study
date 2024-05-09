import Foundation

func solution(_ s:String) -> Int {
    var answer = ""
    var eng = ""
    let alphabet = "abcdefghijklmnopqrstuvwxyz"
    for i in s {
        if alphabet.contains(String(i)) {
            eng += String(i)
        } else {
            answer += String(i)
        }
        if eng == "one" {
            eng = ""
            answer += "1"
        } else if eng == "two" {
            eng = ""
            answer += "2"
        } else if eng == "three" {
            eng = ""
            answer += "3"
        } else if eng == "four" {
            eng = ""
            answer += "4"
        } else if eng == "five" {
            eng = ""
            answer += "5"
        } else if eng == "six" {
            eng = ""
            answer += "6"
        } else if eng == "seven" {
            eng = ""
            answer += "7"
        } else if eng == "eight" {
            eng = ""
            answer += "8"
        } else if eng == "nine" {
            eng = ""
            answer += "9"
        } else if eng == "zero" {
            eng = ""
            answer += "0"
        }
    }
    return Int(answer)!
}
