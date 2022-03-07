import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer n_st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(br.readLine());
        StringTokenizer m_st = new StringTokenizer(br.readLine()," ");

        int[] n_arr = new int[n];
        int[] m_arr = new int[m];

        for(int i=0; i<n; i++){
            n_arr[i] = Integer.parseInt(n_st.nextToken());
        }

        for(int i=0; i<m; i++){
            m_arr[i] = Integer.parseInt(m_st.nextToken());
        }

    }
}