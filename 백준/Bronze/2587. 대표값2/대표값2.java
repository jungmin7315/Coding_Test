import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int b = 0;
        int sum = 0, average = 0;
        int mid = 0;

        for(int i = 0; i<a.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }
        for(int i: a){
            sum += i;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i] < a[j]){
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        average = sum/a.length;
        System.out.println(average);
        System.out.println(a[a.length/2]);
        }
}