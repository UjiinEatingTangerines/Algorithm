import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int b = Integer.parseInt(br.readLine());
            int a = Integer.parseInt(br.readLine());
            b++;
            int[][] arr = new int[b][a];
            for(int j=0; j<b; j++){
                for(int k=0; k<a;k++){
                    if(j == 0) arr[j][k] = k+1;
                    else{
                        int tmp = 0;
                        if(k == 0) tmp = arr[j-1][k];
                        else{
                            for(int h=0; h<=k; h++){
                                tmp += arr[j-1][h];
                            }
                        }

                        arr[j][k] = tmp;
                    }
                }
            }
            bw.write(String.valueOf(arr[b-1][a-1]));
            bw.newLine();
        }
        bw.flush();

    }
}