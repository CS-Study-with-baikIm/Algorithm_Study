package swea_Algorithm;

import java.util.Scanner;

public class Solution_19185 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		for(int i = 0; i < T; i++) {

			int sLength;
			sLength = sc.nextInt();

			int tLength;
			tLength = sc.nextInt();
			
			String[] sArr= new String[sLength];
			String[] tArr = new String[tLength];
			
			for(int j = 0; j < sLength; j++) {
				sArr[j] = sc.next();
			}
			for(int j = 0; j < tLength; j++) {
				tArr[j] = sc.next();
			}
			
			int Q = sc.nextInt();
			
			String[] answer = new String[Q];
			
			for(int j = 0; j < answer.length; j++) {
				int year = sc.nextInt();
				answer[j] = sArr[((year-1) % sArr.length)] + tArr[((year-1) % tArr.length)];
			}
            
			
			System.out.printf("#%d", i+1);
			
			for(int j = 0; j < answer.length; j++) {
				System.out.printf(" %s", answer[j]);
			}
			System.out.println();
		}
	}

}
