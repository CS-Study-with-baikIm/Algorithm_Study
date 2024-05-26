class Solution {

    //  2시간 정도 헤매다가 완전탐색의 예제로 힌트를 얻으로 본 포스팅이 하필 이 문제와 같아서 허무하게 풀어버렸다.
    //  자고 일어나서 쉬운 문제 더 풀 것이다.


    /*
        깊이 우선 탐색을 할 때에는 내가 들어간 깊이(depth)를 저장해야 하고 이 것을 이용해서 풀어야 한다.

        이 풀이의 경우는 visited로 방문을 체크하고 방문하지 않은 곳을 들어갈 때 마다 depth를 증가시켜 최대 탐사수를 구했다.

        재귀를 하다보면 전역 변수의 값이 모두 true가 될 수 있기에

        visited[i] = true;
        dfs(depth + 1, k - dungeons[i][1], dungeons);
        visited[i] = false;

        이렇게 false로 바꿔줘야 하는 것도 중요하다.
    */



    public int answer;
    public boolean[] visited;

    public int solution(int k, int[][] dungeons) {

        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }


    private void dfs(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }

        answer = answer > depth ? answer : depth;
    }



    /*
        생쑈의 흔적
    */

//     private int tiredCount(int k, int[][] dungeons){
//         int count = 0;
//         int tired = k;
//         for(int i = 0; i < dungeons.length; i++ ){
//             System.out.print("tired = " + tired +" minT = " + dungeons[i][0] + "/" + dungeons[i][1]);

//             if(dungeons[i][0] < tired){
//                 tired -= dungeons[i][1];
//                 count++;
//             }
//         }
//         System.out.println();
//         System.out.println(count);

//         return count;
//     }

}