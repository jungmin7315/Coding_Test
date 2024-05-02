import java.io.*;
import java.util.*;

public class Main {

    static int arr[];
    static int temp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        temp = new int[arr.length];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0,n-1);

        for(int i:arr){
//            System.out.println(i);
            str.append(i+"\n");
        }

        System.out.println(str);

    }

    public static void mergeSort(int Start, int End){
        if(End - Start < 1) return;

        int Middle = ( End + Start) / 2;
        mergeSort(Start, Middle);
        mergeSort(Middle + 1, End);

        for(int i = Start;  i <= End; i++){
            temp[i] = arr[i];
        }

        int k = Start;
        int x = Start;
        int y = Middle + 1;
        while (x <= Middle && y <= End) {
            if(temp[x] < temp[y]){
                arr[k++] = temp[x++];
            }else{
                arr[k++] = temp[y++];
            }
        }
        while(x<=Middle){
            arr[k++] = temp[x++];
        }
        while(y<=End){
            arr[k++] = temp[y++];
        }
    }
}