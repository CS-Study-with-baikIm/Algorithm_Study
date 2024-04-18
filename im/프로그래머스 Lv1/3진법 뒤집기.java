class Solution {
    public int solution(int n) {

        /*
            3진법 변환 + 뒤집기
            문자열에 3으로 나눈 나머지를 더하고 전체 숫자를 3으로 나누면 변환과 뒤집기가 한번에 가능하다.

            10진법 변환
            나의 풀이 :
            반복문을 3진법이 0보다 크면 10으로 나눈 나머지와 3 * Math.pow(3, 반복 횟수)를 해주었다.
            + 3진법을 int로 넣었을 때 int의 범위를 넘어서는 경우가 있어 long을 사용했다.

            배운 풀이 :
            Integer.parseInt(tri, 3);
            parseInt에 변환할 수 , 진법의 형식으로 할 수 있다.
        */

        int answer = 0;

        String tri = "";
        // 3진법 변환 후 뒤집기
        while(n>0){
            tri += n%3;
            n/=3;
        }
        System.out.println(tri);

        // 10진법 변환 [입력값:78413450 , 기댓값:110105530]
        long intTri = Long.parseLong(tri);
        int a = 0;
        for(long i = intTri; i > 0; i/=10){
            answer += i%10 * (int)Math.pow(3, a);
            a++;
        }
        System.out.println(answer);
        return answer;

        // parseInt 사용
        // return Integer.parseInt(tri, 3);
    }
}