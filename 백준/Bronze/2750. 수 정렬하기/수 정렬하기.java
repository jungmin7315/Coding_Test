import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int n[] = new int[Integer.parseInt(st.nextToken())];

        int tmp = 0;

        for (int i = 0; i < n.length; i++) {
            st = new StringTokenizer(br.readLine());
            n[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i< n.length; i++){
            for(int j = 0; j<n.length; j++){
                if(n[i] < n[j]){
                    tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }
        for(int i:n){
            str.append(i+"\n");
        }
        System.out.println(str);
    }
}