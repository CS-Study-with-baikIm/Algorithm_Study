class Solution {
    public String solution(String s) {



        /*
            예제가 1자리 정수라 1자리로 설정하고 했는데
            다틀렸다.

            공백 기준으로 문자 뽑게 다시 만들어야 겠다.

            + String[] tmp = str.split(" "); split으로 공백기준으로 나누어 int 배열 만들어 정렬하는 법도 있다.
        */


        int index = 0;
        while(s.charAt(index) != ' ')index++;

        String start = s.substring(0,index);
        start = start.trim();

        int max = Integer.parseInt(start);
        int min = max;

        int count = 0;


        while(s.length() > 0){
            if(!s.contains(" ")){
                int num = Integer.parseInt(s);
                if(num > max) max = num;
                if(num < min) min = num;
                System.out.println("s_" + num);

                break;
            }

            count = 0;
            while(s.charAt(count) != ' ') {
                count++;

            }

            int num = Integer.parseInt(s.substring(0,count));
            System.out.println("s_" + num);

            if(num > max) max = num;
            if(num < min) min = num;

            s = s.substring(count+1);

        }


        return min + " " + max;


        // 한자리라고 가정했을 때


//         String start = "" + s.charAt(0) + s.charAt(1);
//         start = start.trim();

//         int max = Integer.parseInt(start);
//         int min = max;


//         while(s.length()>1){
//             s = s.trim();
//             String num = "" + s.charAt(0) + s.charAt(1);
//             num = num.trim();
//             int n = Integer.parseInt(num);
//             if(n > max) max = n;
//             if(n < min) min = n;

//             s = s.substring(2);

//             System.out.println(s);
//         }

//         if(s.length() == 1){
//             int ss = Integer.parseInt(s);

//             if(ss > max) max = ss;
//             if(ss < min) min = ss;
//         }

//         return min + " " + max;
    }
}