import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer siteNameAndPwd = new StringTokenizer(br.readLine()," ");
            hashMap.put(siteNameAndPwd.nextToken(), siteNameAndPwd.nextToken());
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if(hashMap.get(str) != null) {
                bw.write(hashMap.get(str));
                bw.newLine();
            }
        }

        bw.flush();

    }
}