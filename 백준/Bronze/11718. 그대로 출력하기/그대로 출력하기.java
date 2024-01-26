import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            if (input == null || input.equals("")) {
				break;
			}
            System.out.printf("%s%n",input);
        }
    }
}