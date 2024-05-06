
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
            int[] count = new int[2*n - 1];
            for(int i = 0; i < count.length; i++){
                count[count.length - i - 1] = i / 2 + 1;
            }

            int direction = 0;
            int mat1 = 0;
            int mat2 = -1;
            int[][] matrix = new int[n][n];
            int num = 1;

            while ( direction < count.length ){
                if(direction % 4 == 0){
                    for(int j = 0; j < count[direction]; j++){
                        mat2++;
                        matrix[mat1][mat2] = num;
                        num++;
                    }
                }

                if(direction % 4 == 1){
                    for(int j = 0; j < count[direction]; j++){
                        mat1++;
                        matrix[mat1][mat2] = num;
                        num++;
                    }
                }

                if(direction % 4 == 2){
                    for(int j = 0; j < count[direction]; j++){
                        mat2--;
                        matrix[mat1][mat2] = num;
                        num++;
                    }
                }

                if(direction % 4 == 3){
                    for(int j = 0; j < count[direction]; j++){
                        mat1--;
                        matrix[mat1][mat2] = num;
                        num++;
                    }
                }


                direction++;
            }


            System.out.println("#" + test_case );
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print( matrix[i][j] + " "  );
                }
                System.out.println(  );

            }




        }
    }
}