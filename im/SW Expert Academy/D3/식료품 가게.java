
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int n = sc.nextInt();
            String blank = sc.nextLine();
            String numStr = sc.nextLine();

            String[] strArr = numStr.split(" ");
            int[] numArr = new int[strArr.length];
            String answer = "";

            for(int i = 0; i < strArr.length; i++){
                numArr[i] = Integer.parseInt(strArr[i]);
            }

            for(int i  = numArr.length -1 ; i >= 0; i--){
                for(int j = 0; j < i; j++){
                    if(numArr[i] * 0.75 == numArr[j] && numArr[i] != 0){
                        answer = " " + numArr[j] + answer;
                        numArr[j] = 0;
                        break;
                    }
                }
            }


            System.out.println("#" + test_case + answer );

        }
    }
}