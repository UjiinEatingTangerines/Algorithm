import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] sumArr = new int[n+1];
        StringTokenizer arr_num = new StringTokenizer(br.readLine(), " ");

        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(arr_num.nextToken());
        }

        for(int i=0; i<=n; i++){
            if(i==0) sumArr[i] = 0;
            else sumArr[i] = sumArr[i-1]+arr[i];
        }

        StringTokenizer around_num;
        for(int i=0; i<m; i++){
            around_num = new StringTokenizer(br.readLine(), " ");

            int firstNum = Integer.parseInt(around_num.nextToken());
            int secondNum = Integer.parseInt(around_num.nextToken());

            int result = sumArr[secondNum] - sumArr[firstNum-1];
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
    }
}