import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(resultArr);

        for(int i=0; i<51; i++){
            for(int j=0; j<resultArr.length; j++){
                if(resultArr[j].length() == i+1){
                    bw.write(resultArr[j]);
                    bw.newLine();
                }
            }
        }

        bw.flush();

    }
}