import Foundation

func solution(_ cards1:[String], _ cards2:[String], _ goal:[String]) -> String {
    var card1 = cards1
    var card2 = cards2
    for text in goal {
        if card1.isEmpty {
            if text == card2.first! {
                card2.remove(at: 0)
            } else {
                return "No"
            }
        } else if card2.isEmpty {
            if text == card1.first! {
                card1.remove(at: 0)
            } else {
                return "No"
            }
            
        } else {
            if text == card1.first! {
                card1.remove(at: 0)
            } else if text == card2.first! {
                card2.remove(at: 0)
            } else {
                return "No"
            }
        }
    }
    return "Yes"
}


/*
 카드1과 카드2 중에서 goal에 단어와 일치하는 단어를 확인하고 첫번째 인덱스 제거
 일치하는 단어가 없는 경우에 no return
 
 예외적으로 하나의 카드뭉치를 다 사용한 경우 그 카드뭉치를 확인하지 않는 조건 추가
 
 조건에 카드1,2 에는 서로 다른 단어만 존재하기에 카드 제거 순서로 인해 실패할 경우 배제
 */

// 다른사람의 풀이

func solution(_ cards1:[String], _ cards2:[String], _ goal:[String]) -> String {
    var card1 = cards1
    var card2 = cards2
    for text in goal {
        if !card1.isEmpty && text == card1.first! {
            card1.remove(at: 0)
        } else if !card2.isEmpty && text == card2.first! {
            card2.remove(at: 0)
        } else {
            return "No"
        }
    }
    return "Yes"
}

/*
 if 조건에 여러 조건을 검색할 경우 선행조건이 false라면 후행 조건 검색을 실행하지 않음
 그렇기에 위에 풀이와 달리 조건의 순서를 통해 코드를 단축할 수 있음
 */
