import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = "*";
        StringBuilder sb = new StringBuilder();

        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                sb.append(str);
            }
            bw.write(sb.toString());
            bw.newLine();
            sb.delete(0,sb.length());
        }
        bw.flush();

    }
}
