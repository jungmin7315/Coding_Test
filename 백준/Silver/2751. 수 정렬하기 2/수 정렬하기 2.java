import java.io.*;
import java.util.*;

public class Main {
    static int k[];
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = new int[Integer.parseInt(st.nextToken())];
        tmp = new int[k.length];

        for (int i = 0; i < k.length; i++) {
            st = new StringTokenizer(br.readLine());
            k[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0, k.length - 1);
        for(int i:k){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && k[p] < k[q])) {
                    tmp[idx++] = k[p++];
                } else {
                    tmp[idx++] = k[q++];
                }
            }
            for (int i = start; i <= end; i++) {
                k[i] = tmp[i];
            }
        }

    }
}