import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Boolean[] booleanArray = new Boolean[arr[n-1]+1];
        Arrays.fill(booleanArray, false);

        for(int i=2; i<=arr[n-1]; i++){
            for(int j=i; j<=arr[n-1]; j++){
                if(i == j) continue;
                if(j%i == 0)
                    booleanArray[j] = true;
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0 || arr[i] == 1) continue;
            if(!booleanArray[arr[i]]){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

    }
}