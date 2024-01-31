import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int tmp = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        //오름차순 정렬
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            
        }
        for(int i:arr){
            System.out.println(i);
        }        
        
        br.close();
    }
}