//
//  신고 결과 받기.swift
//  Algorithm
//
//  Created by jonghyun baik on 4/30/24.
//

import Foundation

func solution(_ id_list:[String], _ report:[String], _ k:Int) -> [Int] {
    var result: [Int] = Array(repeating: 0, count: id_list.count)
    var reportedInfo = [String: Set<String>]()
    var suspendedUser = [String]()
    
    // 딕셔너리 만들기
    id_list.forEach { id in
        reportedInfo[id] = []
    }
    
    // 유저별 신고당한 정보 구하기
    report.map { $0.split(separator: " ") }.forEach { content in
        let reporter = String(content[0]), reported = String(content[1])
        reportedInfo[reported]?.insert(reporter)    // 동일 중복 신고 방지
    }
    
    // 이용 정지 유저 구하기
    reportedInfo.forEach { report in
        if report.value.count >= k {
            suspendedUser.append(report.key)
        }
    }
    
    // 유저별 받을 메일 수 구하기
    suspendedUser.forEach { key in
        reportedInfo[key]!.forEach { id in
            result[id_list.firstIndex(of: id)!] += 1
        }
    }
    
    return result
}

// 중복 체크를 하는 부분에서 헤멤
