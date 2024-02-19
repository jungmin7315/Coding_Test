import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int n = 0;
        int cnt = 0;
        int top = 0;
        int bt = 0;
        if(x==1){
            top = 1;
            bt = 1;
        }else{
            while(x>cnt){
                n++;
                cnt=n*(n+1)/2;
            }
            int num = x-(n-1)*n/2;
            if(n%2==0){
                top= num;
                bt = n-num+1;
            }else{
                top = n-num+1;
                bt = num;
            }
        }
        System.out.println(top+"/"+bt);
        br.close();
    }
}