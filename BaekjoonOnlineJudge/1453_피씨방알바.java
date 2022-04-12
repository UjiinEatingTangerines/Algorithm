import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0; i<n; i++){

            int deskNumber = Integer.parseInt(st.nextToken());

            if(hashMap.get(deskNumber) != null){
                count++;
            }else{
                hashMap.put(deskNumber,i);
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

    }
}
