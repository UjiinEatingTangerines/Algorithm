import java.io.*;
import java.util.StringTokenizer;

public class Mains {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"/");

        int kill = Integer.parseInt(st.nextToken());
        int deth = Integer.parseInt(st.nextToken());
        int assist = Integer.parseInt(st.nextToken());

        String dariusIsJJin = "gosu";

        if(deth == 0) dariusIsJJin = "hasu";
        else if((kill+assist) < deth) dariusIsJJin = "hasu";

        bw.write(dariusIsJJin);
        bw.flush();

    }
}