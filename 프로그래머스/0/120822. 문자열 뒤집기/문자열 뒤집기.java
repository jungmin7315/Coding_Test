class Solution {
    public static String solution(String num_list) {
        return filp(num_list);
    }

    public static String filp(String arr){
        char tmp = '0';
        char[] answer = arr.toCharArray();

        for(int i =0;i<answer.length;i++){
            if(i >= answer.length/2){
                break;
            }
            tmp = answer[i];
            answer[i] = answer[answer.length-1-i];
            answer[answer.length-1-i] = tmp;
        }

        arr = new String(answer);

        return arr;
    }
}