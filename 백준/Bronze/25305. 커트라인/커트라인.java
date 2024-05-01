import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] n = new int[Integer.parseInt(st.nextToken())];
        int k = Integer.parseInt(st.nextToken());
        int number = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n.length; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                if(n[i] > n[j]){
                    number = n[i];
                    n[i] = n[j];
                    n[j] = number;
                }
            }
        }
        System.out.print(n[k-1]);
        }
}