import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};

        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        List<Integer> arrList = new ArrayList<>(Arrays.asList(integerArray));

        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int min = arr[0];
        // System.out.println(min);


        arrList.remove(Integer.valueOf(min));


        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}