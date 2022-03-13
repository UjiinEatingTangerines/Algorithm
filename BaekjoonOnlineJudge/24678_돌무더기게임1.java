import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        long[] arr = new long[3];

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String name = "B";
            st = new StringTokenizer(br.readLine()," ");

            for(int j=0; j<3; j++){
                arr[j] = Long.valueOf(st.nextToken());
            }

            if((arr[0]%2 == 0 && arr[1]%2 == 0) || (arr[0]%2 == 0 && arr[2]%2 == 0) || (arr[1]%2 == 0 && arr[2]%2 == 0)){
                name = "R";
            }

            bw.write(name);
            bw.newLine();
        }
        bw.flush();
    }
}