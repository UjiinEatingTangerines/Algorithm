import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.valueOf(st.nextToken());
            double result = 0.000;

            int[] arr = new int[a];
            for(int j=0; j<a; j++){
                int score =  Integer.valueOf(st.nextToken());
                result += score;
                arr[j] = score;
            }
            result = result/a;
            int count =0;
            for(int j=0; j<a; j++){
                if(result < arr[j]) count++;
            }
            result = ((double) count/a)*100;
            String result2 = String.format("%.3f", result);
            bw.write(result2 + "%");
            bw.newLine();
        }
        bw.flush();


    }
}
