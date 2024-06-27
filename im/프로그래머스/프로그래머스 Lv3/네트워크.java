class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        // visited 가 false면 노드 증가시키고 dfs로 이어서 쭉 탐색
        for(int i =0; i < n; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, visited, computers);
            }
        }

        return answer;
    }

    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;

        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }

}