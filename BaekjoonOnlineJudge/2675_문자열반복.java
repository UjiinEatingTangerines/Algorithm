import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            String tmp = st.nextToken();
            for(int j=0; j<tmp.length(); j++){
                char char_tmp = tmp.charAt(j);
                for(int k=0; k<a; k++){
                    sb.append(char_tmp);
                }
            }
            bw.write(sb.toString());
            bw.newLine();
            sb.setLength(0);
        }
        bw.flush();

    }
}