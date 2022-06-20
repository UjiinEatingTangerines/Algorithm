import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        Map<String, Integer> hashMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(),".");
            String fileName = st.nextToken();
            String fileExtension = st.nextToken();

            if(hashMap.containsKey(fileExtension)) hashMap.put(fileExtension, hashMap.get(fileExtension)+1);
            else hashMap.put(fileExtension, 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sb.append(entry.getKey() + " " + entry.getValue()+"\n");
        }
        bw.write(sb.toString());
        bw.flush();


    }

}
