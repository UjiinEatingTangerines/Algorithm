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

        int[] arr = new int[9];
        arr[0] = 0;
        int count = 8;
        int plus_tmp = 0;
        int minus_tmp = 0;
        String result = "mixed";
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<9; i++){

            arr[i] = Integer.parseInt(st.nextToken());
            if(i == arr[i]){
                plus_tmp++;
            }else if(count == arr[i]){
                count--;
                minus_tmp++;
            }
        }

        if(plus_tmp == 8){
            result = "ascending";
        }else if(minus_tmp == 8){
            result = "descending";
        }

        bw.write(result);
        bw.newLine();
        bw.flush();

    }
}