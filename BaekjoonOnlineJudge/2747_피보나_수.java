import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.valueOf(br.readLine());
        long[] arr = new long[46];

        for(int i=0; i<arr.length; i++){
            if(i <= 1) arr[i] = i;
            else arr[i] = arr[i-1] + arr[i-2];
        }
        bw.write(String.valueOf(arr[Integer.parseInt(String.valueOf(n))]));
        bw.newLine();
        bw.flush();
    }

}