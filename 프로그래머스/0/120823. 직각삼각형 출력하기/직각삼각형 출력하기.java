import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            String stars = "";
            for(int j = 0; j <= i; j++){
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}