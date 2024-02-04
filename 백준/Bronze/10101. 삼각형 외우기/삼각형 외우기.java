import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a+b+c;

        if(a == b && b==c && sum == 180){ //세 각의 크기가 모두 60이면, Equilateral
            System.out.println("Equilateral");
        }else if((a == b || b==c || a==c) && sum == 180){ //세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
            System.out.println("Isosceles");
        }else if(a+b+c == 180){ // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
            System.out.println("Scalene");
        }else{ //세 각의 합이 180이 아닌 경우에는 Error
            System.out.println("Error");
        }
    }
}