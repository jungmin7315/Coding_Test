import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();

        System.out.println(N*(N-1)/2);
        System.out.println(2);
    }
}