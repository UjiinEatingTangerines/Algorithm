import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int sangGeon = Integer.valueOf(st.nextToken());
            int sunyeong = Integer.valueOf(st.nextToken());

            if(sangGeon == 0 && sunyeong == 0) break;

            HashSet<String> hashSet = new HashSet<>();
            int count = 0;

            for (int i = 0; i < sangGeon; i++) {
                hashSet.add(br.readLine());
            }

            for (int i = 0; i < sunyeong; i++) {
                if(hashSet.contains(br.readLine())) count++;
            }

            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();

    }

}
