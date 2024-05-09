import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String solution(String letter) {
        StringTokenizer st = new StringTokenizer(letter);
        Map<String, Character> morse = new HashMap<String, Character>(){{
            put(".-",'a');put("-...",'b');put("-.-.",'c');put("-..",'d');put(".",'e');
            put("..-.",'f');put("--.",'g');put("....",'h');put("..",'i');put(".---",'j');
            put("-.-",'k');put(".-..",'l');put("--",'m');put("-.",'n');put("---",'o');
            put(".--.",'p');put("--.-",'q');put(".-.",'r');put("...",'s');put("-",'t');
            put("..-",'u');put("...-",'v');put(".--",'w');put("-..-",'x');put("-.--",'y');
            put("--..",'z');
        }};
        String answer = "";
        int count = st.countTokens();
        for(int i = 0; i < count; i++) {
            answer += morse.get(st.nextToken());
        }
        return answer;
    }
}