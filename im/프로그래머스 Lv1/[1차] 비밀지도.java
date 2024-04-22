import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];

        // 배열이 null로 초기화 되어있기 때문에 공백으로 바꿔주기
        Arrays.fill(answer, "");


        for(int i = 0; i < n; i++){

            // format 변환 빈 자리에 0이 오게
            strArr1[i] = format(binary(arr1[i]), n);
            strArr2[i] = format(binary(arr2[i]), n);

            for(int j =0; j< n; j++){
                if(strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j)== '1') answer[i] += "#";
                else answer[i] += " ";
            }
        }


        return answer;
    }

    public long binary(int a){
        String str = Integer.toString(a, 2);
        return Long.parseLong(str);
    }

    public String format(long a, int n){
        return String.format("%0"+n+"d", a);
    }
}