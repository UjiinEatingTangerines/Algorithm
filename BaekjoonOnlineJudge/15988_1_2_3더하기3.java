import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[1000001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;


        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            for(int j=4; j<=a; j++){
                arr[j] = (arr[j-2]+arr[j-1]+arr[j-3])%1000000009;
            }
            bw.write(String.valueOf(arr[a]));
            bw.newLine();
        }

        bw.flush();

    }
}