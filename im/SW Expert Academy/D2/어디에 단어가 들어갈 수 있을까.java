
import java.util.Scanner;
import java.io.FileInputStream;


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
            int num = sc.nextInt();

            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            int answer = 0;



            for(int i = 0; i < n; i++){
                int row = 0;
                int column = 0;
                for(int j = 0; j < n; j++){


                    if(j == 0){
                        if(matrix[i][j] == 1) row++;
                        if(matrix[j][i] == 1) column++;
                    }

                    else{
                        if(matrix[i][j] == 1) row++;
                        else {
                            if(row == num) answer++;
                            row = 0;
                        }

                        if(matrix[j][i] == 1) column++;
                        else {
                            if(column == num) answer++;
                            column = 0;
                        }
                    }


                }
                if(row == num) answer++;
                if(column == num) answer++;

            }

            System.out.println("#" +test_case+ " " + answer );


        }
    }
}