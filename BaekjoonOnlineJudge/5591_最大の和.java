import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int countNumber = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[countNumber];

        for(int i=0; i<countNumber; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        for(int i=0; i<countNumber-n; i++){
            int fakeResult = 0;
            for(int j=i; j<i+n; j++){
                fakeResult+= arr[j];
            }
            if(fakeResult > result) result = fakeResult;
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
