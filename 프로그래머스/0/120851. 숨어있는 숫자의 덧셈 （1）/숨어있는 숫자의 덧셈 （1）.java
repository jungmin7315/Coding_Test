class Solution {
    public int solution(String my_string) {
        char[] ch = new char[my_string.length()];
        ch = my_string.toCharArray();
        int answer = 0;
        
        for(int i = 0; i<ch.length; i++){
            if(ch[i] < 65){
                answer += Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        
        return answer;
    }
}