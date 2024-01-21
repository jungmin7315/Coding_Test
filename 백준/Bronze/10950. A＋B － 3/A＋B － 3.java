import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        for(int i=0;i<count;i++){
            int su1 = sc.nextInt();
            int su2 = sc.nextInt();
            System.out.printf("%d%n",su1+su2);
        }
        
    }
}