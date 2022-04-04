import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int size = st.countTokens();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        String str = new String();

        for(int i=0; i<size; i++){
            if(i+1 == size){
                sb.append(arr[i]);
                continue;
            }
            sb.append(arr[i]+" ");
        }
        bw.write(sb.toString());
        bw.flush();

    }

}