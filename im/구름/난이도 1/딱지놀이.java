import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){

            int aN = sc.nextInt();
            int[] aArr = {0,0,0,0};
            for(int j = 0; j < aN; j++){
                int num = sc.nextInt();
                if(num == 4) aArr[0]++;
                if(num == 3) aArr[1]++;
                if(num == 2) aArr[2]++;
                if(num == 1) aArr[3]++;
            }

            int bN = sc.nextInt();
            int[] bArr = {0,0,0,0};
            for(int j = 0; j < bN; j++){
                int num = sc.nextInt();
                if(num == 4) bArr[0]++;
                if(num == 3) bArr[1]++;
                if(num == 2) bArr[2]++;
                if(num == 1) bArr[3]++;
            }


            for(int j = 0; j <4; j++){
                if(aArr[j]> bArr[j]) {
                    System.out.println("A");
                    break;
                }
                if(aArr[j] < bArr[j]) {
                    System.out.println("B");
                    break;
                }
                if(j == 3) System.out.println("D");

            }

        }
        System.out.println();
    }
}