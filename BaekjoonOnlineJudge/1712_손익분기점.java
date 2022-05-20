import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Integer.valueOf(st.nextToken());
        long b = Integer.valueOf(st.nextToken());
        long c = Integer.valueOf(st.nextToken());

        if(c-b <= 0)
            bw.write("-1");
        else
            bw.write(String.valueOf((a/(c-b))+1));
        bw.flush();

    }
}