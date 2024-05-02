import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char c[] =br.readLine().toCharArray();
        int n[] = new int[c.length];
        int temp = 0;

        for(int i = 0; i<c.length;i++){
            n[i] =  c[i] - '0';
        }

        for(int i = 0; i<n.length; i++){
            for(int j = 0; j < i; j++){
               if(n[i] > n[j]){
                   temp = n[i];
                   n[i] = n[j];
                   n[j] = temp;
               }
            }
        }

        for(int i:n){
            sb.append(i);
        }
        System.out.println(sb);

    }
}