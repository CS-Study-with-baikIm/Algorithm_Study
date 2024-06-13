import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 테스트 케이스 만큼 반복
        for(int i = 0; i < n; i++){

            // N과 R 개수 입력 받기
            int N = sc.nextInt();
            int R = sc.nextInt();

            long child = R;
            long mom = 1;
            // 나라의 수만큼 반복문 돌며 세율만큼 계산하기
            for(int j = 0; j < N; j++){
                int tax = sc.nextInt();
                child *= 100;
                mom *= 100;
                child = child - child * tax / 100;
                long gcd = GCD(child, mom);
                child = child / gcd;
                mom = mom / gcd;
            }

            if(child == 0) System.out.println("0/1");
            else System.out.println(child + "/" + mom);

        }

    }

    // 최대 공약수
    public static long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }
}