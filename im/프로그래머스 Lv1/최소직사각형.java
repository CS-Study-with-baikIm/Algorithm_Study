import java.util.*;

class Solution {
    public int solution(int[][] sizes) {

        // 왼쪽에 큰 값으로 정렬
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        // 가장 큰 왼쪽 값 가져오기
        int left = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > left) left = sizes[i][0];
        }

        // 가장 큰 오른쪽 값 가져오기
        int right = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][1] > right) right = sizes[i][1];
        }

        // for문으로 제출하기
        // return left*right;


        // min max 활용한 풀이

        int maxWidth = 0;
        int maxHeight = 0;

        // 주어진 명함의 가로와 세로 길이를 확인하여 가장 긴 길이를 찾음
        for (int[] size : sizes) {
            // 주어진 두 값 중 큰 값과 maxWidth 비교 후 큰 값을 가로로 저장
            maxWidth = Math.max(maxWidth, Math.max(size[0], size[1]));
            // 주어진 두 값 중 작은 값과 maxWidth 비교 후 큰 값을 세로로 저장
            maxHeight = Math.max(maxHeight, Math.min(size[0], size[1]));
        }

        // 가장 작은 지갑의 크기는 가장 긴 가로 길이와 세로 길이를 곱한 것이 됨
        return maxWidth * maxHeight;
    }
}