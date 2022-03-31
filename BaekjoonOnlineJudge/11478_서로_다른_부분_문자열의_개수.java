import java.io.*;
import java.util.HashMap;

public class Main {

    int solution (String str) {

        HashMap hashMap = new HashMap();

        int count = 0;
        int subStringLength = 1;

        while (true){

            if(hashMap.get(str) != null) break;

            hashMap.put(str.substring(count,count+subStringLength), str.substring(count,count+subStringLength));
            count++;

            if(count+subStringLength-1 == str.length()) {
                count = 0;
                subStringLength++;
            }

        }

        return hashMap.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Main main = new Main();

        bw.write(String.valueOf(main.solution(br.readLine()))); // ababac 12
        bw.flush();

    }

}
