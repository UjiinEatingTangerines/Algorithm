import java.io.*;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a_Baguni = new int[2];
        int[] b_Baguni = new int[2];

        int result = 0;

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<2; j++){

                if(i == 0) a_Baguni[j] = Integer.parseInt(st.nextToken());
                else b_Baguni[j] = Integer.parseInt(st.nextToken());

            }
        }

        if(a_Baguni[0]+b_Baguni[1] >= a_Baguni[1]+b_Baguni[0]) result += a_Baguni[1]+b_Baguni[0];
        else result += a_Baguni[0]+b_Baguni[1];

        bw.write(String.valueOf(result));
        bw.flush();

    }
}
