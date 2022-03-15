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

        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());
        long c = Long.valueOf(st.nextToken());

        long result = a+b+c;

        bw.write(String.valueOf(result));
        bw.flush();


    }
}