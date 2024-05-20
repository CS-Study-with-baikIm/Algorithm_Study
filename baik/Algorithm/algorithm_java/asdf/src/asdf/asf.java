import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int [N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int count = 0;
            int[][] ans = new int[N*2][2];
            for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) {
            		ans[count][0] = arr[i];
            		ans[count][1] = arr[j];
            		count++;
                }
            }
            
            for(int i = 0; i < N*N; i++) {
                for(int j = 0; j < N*N-1; j++) {
                	if(ans[j][1] > ans[j+1][1]) {
                		int[] temp = ans[j];
                		ans[j] = ans[j+1];
                		ans[j+1] = temp;
                	}
                }
            }
            for(int i = 0; i < N*N; i++) {
                for(int j = 0; j < N*N-1; j++) {
                	if(ans[j][0] > ans[j+1][0]) {
                		int[] temp = ans[j];
                		ans[j] = ans[j+1];
                		ans[j+1] = temp;
                	}
                }
            }
            
			System.out.println("#" + test_case + " " + (ans[K-1][0] + ans[K-1][1]));
		}

		sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
	}
}