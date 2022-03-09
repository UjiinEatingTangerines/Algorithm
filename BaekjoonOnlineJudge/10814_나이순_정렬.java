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

        int n = Integer.parseInt(br.readLine());

        int[] age_arr = new int[n];
        String[] name_arr = new String[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            age_arr[i] = Integer.parseInt(st.nextToken());
            name_arr[i] = st.nextToken();
        }

        for(int i=0; i<=200; i++){
            for(int j=0; j<n; j++){
                if(age_arr[j] == i){
                    bw.write(age_arr[j]+" "+name_arr[j]);
                    bw.newLine();
                }
            }
        }
        bw.flush();

    }
}