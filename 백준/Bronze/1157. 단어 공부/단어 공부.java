import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //입력받은 문자열을 모두 대문자로 통일하여 저장하는 변수
        String input = br.readLine().toUpperCase();
        //문자열을 문자로 나눠 저장하는 변수
        char[] alphabet = input.toCharArray();
        //가장 많이 사용된 알파벳 저장하는 변수
        int[] al = new int[26];
        
        //입력받은 문자 - 'A'로 각 알파벳 순서의 맞게 증가
        for(int i=0;i<alphabet.length;i++){
            al[alphabet[i] -'A'] += 1;
        }        
        int max = 0;     //최대값 변수
        int count = 27;  //만약 중복값이 있을시 ?로 설정하기 위한 27초기값 
        //최대값 구하기와 중복값이 있는지 없는지 체크하는 코드
        for(int i=0;i<al.length;i++){
            if(max < al[i]){
                max = al[i];
                count = i;
            }else if(max == al[i]){
                count=27;
            }
        }
        //중복값이 있으면 ?를 출력 없으면 가장 많이 사용한 알파벳 출력
        if(count != 27){
            System.out.printf("%c",count+'A');
        }else{
            System.out.println("?");
        }
        
        br.close();
    }
}