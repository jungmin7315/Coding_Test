class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i=0;i<my_string.length();i++){
            if(ch[i] < 97){
                answer += Character.toLowerCase(ch[i]);
            } else{
                answer += Character.toUpperCase(ch[i]);
            }
        }

        return answer;
    }
}