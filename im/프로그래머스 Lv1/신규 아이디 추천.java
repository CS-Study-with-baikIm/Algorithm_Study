class Solution {
    public String solution(String new_id) {

        /*
            각 단계별로 나누어 풀기

            replaceAll("[^-_.a-z0-9]","") 정규식을 활용하면 더 쉽게 풀 수 있다.
        */


        String answer = "";

        answer = step1(new_id);

        answer = step2(answer);

        answer = step3(answer);

        answer = step4(answer);

        answer = step5(answer);

        answer = step6(answer);

        answer = step7(answer);


        return answer;
    }

    // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    private String step1(String answer){
        return answer.toLowerCase();
    }

    // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    private String step2(String answer){
        for(int i = 0; i<answer.length(); i++){
            // a = 97, z = 122 , 0 = 48, 9 = 57
            if( !(answer.charAt(i) == '-' || answer.charAt(i) == '_' || answer.charAt(i) == '.') ){
                if(answer.charAt(i) < 97 || answer.charAt(i) > 122){
                    if(answer.charAt(i) < 48 || answer.charAt(i) > 57){
                        answer = answer.substring(0,i) + " " + answer.substring(i+1);
                    }
                }
            }
        }
        answer = answer.replace(" ", "");
        return answer;
    }

    // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    private String step3(String answer){
        for(int i = 0; i<answer.length() - 1; i++){
            if(answer.charAt(i) == '.' && answer.charAt(i+1) == '.'){
                answer = answer.substring(0,i) + " " + answer.substring(i+1);
            }
        }
        answer = answer.replace(" ", "");
        return answer;
    }

    // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    private String step4(String answer){
        if(answer.length() == 1){
            if( answer.charAt(0) == '.') answer = "";
        }
        else{
            if( answer.charAt(0) == '.') answer= answer.substring(1);
            if( answer.charAt(answer.length()-1) == '.' ) answer = answer.substring(0,answer.length()-1);
        }


        return answer;
    }

    // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    private String step5(String answer){
        if(answer.length() == 0) answer = "a";

        return answer;
    }

    // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    private String step6(String answer){
        if (answer.length() > 15) answer = answer.substring(0,15);


        return step4(answer);
    }

    // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    private String step7(String answer){
        if(answer.length() == 1) answer= answer+answer+answer;
        if(answer.length() == 2) answer = answer+ answer.charAt(1);

        return answer;
    }

}