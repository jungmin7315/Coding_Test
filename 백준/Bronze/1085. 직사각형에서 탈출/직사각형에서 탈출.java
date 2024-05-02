import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int arr[] = {x, y, Math.abs(w - x), Math.abs(h - y)};
        int min = 1001;

        for(int i = 0; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }


        System.out.println(min);



    }
}