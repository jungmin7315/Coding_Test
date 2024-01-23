import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n; //출석 번호
        int[] total_Submit = new int[30]; //총 인원;
        int not_Submit1 = 0; //미제출한 인원1
        int not_Submit2 = 0; //미제출한 인원2
        int tmp = 0;
        
        for(int i=0;i<total_Submit.length;i++){
            total_Submit[i] = i+1;
        }
        //제출한 학생은 0으로 변경하고 제출하지 않은 학생은 번호 그대로 변경하지 않는다.
        for(int i =0;i<28;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); 
            for(int j = 0;j<total_Submit.length;j++){
                if(total_Submit[j] == n){
                    total_Submit[j] = 0;
                    break;
                }
            }
        }
        
        //제출하지 않은 학생 번호 넣기
        for(int i = 0;i<total_Submit.length;i++){
            if(total_Submit[i] != 0){
                tmp = not_Submit1;
                not_Submit1 = total_Submit[i];
                not_Submit2 = total_Submit[i];
            }
        }
        not_Submit1 = tmp;
        
        //어떤 학생의 출석번호가 더 낮은지 체크후 출력
        if(not_Submit1 < not_Submit2){
            System.out.println(not_Submit1);
            System.out.println(not_Submit2);
        }else{
            System.out.println(not_Submit2);
            System.out.println(not_Submit1);
        }
    }
}