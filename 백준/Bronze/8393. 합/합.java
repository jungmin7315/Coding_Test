import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        
        for(int i=1;i<=count;i++){
            sum += i;
        }
        System.out.printf("%d",sum);
        
    }
}