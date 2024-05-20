class Solution {
    public int solution(int[] picks, String[] minerals) {
        int maxCount = 0;
        for(int i : picks){
            maxCount+=i;
        }

        if(maxCount*5 < minerals.length){
            String[] tmp = new String[maxCount*5];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = minerals[i];
            }
            minerals = tmp;
        }



        int[] tSum = new int[minerals.length/5 + 1];
        String[][] strArr = new String[(minerals.length-1)/5 + 1][5];
        int answer = 0;



        for(int i = 0; i < tSum.length; i++){
            int sum = 0;
            for(int j=0; j < 5; j++){
                if(j+i*5 >= minerals.length) break;
                else{
                    switch(minerals[i*5 + j]){
                        case "diamond":
                            sum+=31;
                            break;
                        case "iron":
                            sum+=6;
                            break;
                        case "stone":
                            sum+=1;
                            break;
                    }
                    strArr[i][j] = minerals[j+i*5];

                }

            }
            tSum[i] = sum;

        }

        for(int i = 0; i < tSum.length; i++){
            for(int j = i; j < tSum.length; j++){
                if(tSum[i] < tSum[j]){
                    int tmp = tSum[i];
                    tSum[i] = tSum[j];
                    tSum[j] = tmp;
                    String[] tmpA = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = tmpA;
                }
            }
        }

        // for(int i = 0; i < strArr.length; i++){
        //     for(int j = 0; j < 5; j++){
        //         System.out.print(strArr[i][j] + " ");
        //     }
        //      System.out.println();
        // }

        int count = 0;


        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < 5; j++){
                if(count >= maxCount*5) break;
                if(strArr[i][j] != null){
                    // 다이아 곡괭이
                    if(i < picks[0]){
                        answer++;
                    }
                    // 철
                    else if(i < picks[0] + picks[1]){
                        if(strArr[i][j].equals("diamond")) answer+=5;
                        else answer++;

                    }
                    //돌
                    else{
                        if(strArr[i][j].equals("diamond")) answer+=25;
                        else if(strArr[i][j].equals("iron")) answer+=5;
                        else answer++;

                    }
                }
                count++;
            }
        }


        return answer;
    }
}