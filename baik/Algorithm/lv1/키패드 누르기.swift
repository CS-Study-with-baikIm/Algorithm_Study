import Foundation

func solution(_ numbers:[Int], _ hand:String) -> String {
    var result = ""
    
    var location = [[3,1],[0,0],[0,1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]]
    var thumb = [[3,0],[3,2]]
    for i in numbers {
        switch i {
            case 1, 4, 7:
                result += "L"
                thumb[0] = location[i]
            case 3, 6, 9:
                result += "R"
                thumb[1] = location[i]
            default:
                if abs(location[i][0] - thumb[0][0]) + abs(location[i][1] - thumb[0][1]) < abs(location[i][0] - thumb[1][0]) + abs(location[i][1] - thumb[1][1]) {
                    result += "L"
                    thumb[0] = location[i]
                } else if abs(location[i][0] - thumb[0][0]) + abs(location[i][1] - thumb[0][1]) > abs(location[i][0] - thumb[1][0]) + abs(location[i][1] - thumb[1][1]) {
                    result += "R"
                    thumb[1] = location[i]
                } else {
                    if hand == "left" {
                        result += "L"
                        thumb[0] = location[i]
                    } else {
                        result += "R"
                        thumb[1] = location[i]
                    }
                }
                
        }
    }
    return result
}

/*
 2020 카카오 인턴십 문제였다고 함.
 각 번호의 위치자표를 정해주고 그 위치와에 거리 차이를 계산함
 사용할 손가락을 정하고 그 위치에 손가락을 이동시켜 주는 식으로 구현
 
 문제 자체는 어렵지 않았으나 노가다가 어느정도 들어가기에 코드가 길어짐.
 
 */
