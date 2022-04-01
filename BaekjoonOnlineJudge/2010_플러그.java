import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            if(i+1 == n) arr[i] = Integer.parseInt(br.readLine());
            else arr[i] = Integer.parseInt(br.readLine())-1;
        }


        bw.write(String.valueOf(Arrays.stream(arr).sum()));
        bw.flush();

    }

}
