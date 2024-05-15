package swea_Algorithm;

import java.util.Scanner;

public class Solution_1244 {
    static String[] arr;
    static int max;
    static int count;
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1 ; test_case <= T ; test_case++) {
        	
            arr = sc.next().split("");
            count = sc.nextInt();
            
            max = 0;

            if(arr.length < count) {	
            	count = arr.length;	
            }
            dfs(0, 0);
            System.out.printf("#%d %d\n", test_case, max);
        }
    }
	
    static void dfs(int start, int cnt) {
        if(cnt == count) {
            String result = "";
            for(String s : arr)
                result += s;
            max = Math.max(max, Integer.parseInt(result));
            return;
        }
        for(int i = start; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i, cnt + 1);	
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}