import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[4];
        int[] arr2 = new int[2];

        for(int i=0; i<4; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<2; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int result = 0;

        for(int i=3; i>=1; i--){
            result += arr1[i];
        }

        result += arr2[1];

        bw.write(String.valueOf(result));
        bw.flush();

    }
}
