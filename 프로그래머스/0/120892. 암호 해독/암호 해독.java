class Solution {
    public String solution(String cipher, int code) {
        char[] ch = cipher.toCharArray();
        String answer = "";
        for(int i=code-1; i<ch.length; i = i+code){
            answer += ch[i];
        }

        return answer;
    }
}