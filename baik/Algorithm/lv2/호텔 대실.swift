import Foundation

func solution(_ book_time:[[String]]) -> Int {
    var bookTime: [(Int, Int)] = []
    var rooms: [(Int, Int)] = []
    
    for book in book_time {
        let start = book[0].components(separatedBy: ":")
        let end = book[1].components(separatedBy: ":")
        let startTime = Int(start[0])!*60 + Int(start[1])!
        let endTime = Int(end[0])!*60 + Int(end[1])! + 10
        bookTime.append((startTime, endTime))
    }
    bookTime.sort(by: {
        $0.0 < $1.0
    })
    
loop1: for book in bookTime {
        for (i, room) in rooms.enumerated() {
            if !(room.0..<room.1 ~= book.0) {
                rooms[i] = book
                continue loop1
            }
        }
    rooms.append((book.0, book.1))
    }
    return rooms.count
}
