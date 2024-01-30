import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double majors = 0.0; //전공과목별의 총합 변수
        double grades = 0.0; //학점의 총합 변수;
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine()," ");
            String subject = st.nextToken(); // 과목이름
            String gr = st.nextToken(); //학점
            String ra = st.nextToken(); //등급
            //등급별로 체크후 전공과목별 총합과 학점의 총합 계산하기
            switch(ra){
                case "A+":
                    majors += (Double.parseDouble(gr) * 4.5);
                    grades += Double.parseDouble(gr);
                    break;
                case "A0":
                    majors += (Double.parseDouble(gr) * 4.0);
                    grades += Double.parseDouble(gr);
                    break;
                case "B+":
                    majors += (Double.parseDouble(gr) * 3.5);
                    grades += Double.parseDouble(gr);
                    break;
                case "B0":
                    majors += (Double.parseDouble(gr) * 3.0);
                    grades += Double.parseDouble(gr);
                    break;
                case "C+":
                    majors += (Double.parseDouble(gr) * 2.5);
                    grades += Double.parseDouble(gr);
                    break;
                case "C0":
                    majors += (Double.parseDouble(gr) * 2.0);
                    grades += Double.parseDouble(gr);
                    break;
                case "D+":
                    majors += (Double.parseDouble(gr) * 1.5);
                    grades += Double.parseDouble(gr);
                    break;
                case "D0":
                    majors += (Double.parseDouble(gr) * 1.0);
                    grades += Double.parseDouble(gr);
                    break;
                case "F":
                    majors += (Double.parseDouble(gr) * 0.0);
                    grades += Double.parseDouble(gr);
                default:
                    break;
            }
        }
        //만약 계산후게 학점 총합 변수에 초기값이라면 초기값출력
        if(grades == 0.0){
            System.out.printf("%.6f",grades);
        }else{//그게 아니라면 평균 출력
            System.out.printf("%.6f",majors/grades);
        }
        br.close();
    }
}