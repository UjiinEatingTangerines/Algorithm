import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer n_st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(br.readLine());
        StringTokenizer m_st = new StringTokenizer(br.readLine()," ");

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            hm.put(Integer.parseInt(n_st.nextToken()),i);
        }

        for(int i=0; i<m; i++){
            if(hm.get(Integer.parseInt(m_st.nextToken())) == null){
                bw.write("0");
                bw.newLine();
            }else{
                bw.write("1");
                bw.newLine();
            }
        }
        bw.flush();

    }
}