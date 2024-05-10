import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] card = new int[n];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < card.length; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < card.length; i++) {
            for(int j = i+1; j < card.length; j++) {
                for(int k = j+1; k < card.length; k++) {
                    if(card[i] + card[j] + card[k] <= m && sum <= card[i] + card[j] + card[k]) {
                        sum = card[i] + card[j] + card[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}