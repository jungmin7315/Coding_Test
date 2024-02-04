import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double n = Integer.parseInt(br.readLine());//첫번쨰 숫자

        long sum = (1+(long)Math.pow(2.0,n)); //(1+2^n)^2
        sum *= sum; //(1+2^n)^2

        System.out.printf("%d",sum);
    }
}