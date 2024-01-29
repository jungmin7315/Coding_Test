import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        //카운트 변수
        int count=0;
        for(int i=0;i<n;i++){
            String input = br.readLine();
            //전 문자가 똑같은 문자였는지 확인 하는 변수
            char back = '0';
            //알파벳 목록 체크 배열
            boolean[] al = new boolean[26];
            for(int j=0;j<input.length();j++){
                // 전에 있는 문자가 다르다면 
                if(input.charAt(j) != back){
                    //그 문자가 이미 확인된 문자면 그룹단어 X
                    if(al[input.charAt(j)-'a'] == true){
                        break;
                    }
                    //그렇지 않으면 그 문자를 true로 변경
                    al[input.charAt(j)-'a'] = true;
                    //다시 전에 있는 문자는 버리고 현재 문자로 변경
                    back = input.charAt(j);
                }
                //마지막까지 체크후 아무 이상이 없다면 1증가
                if(j == input.length() -1){
                    count++;
                }
            }
        }
        
        System.out.printf("%d",count);
        
        br.close();
    }
}