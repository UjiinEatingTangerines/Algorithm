import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long[] longArr = new Long[n];

        for(int i = 0; i<n; i++){
            longArr[i] = Long.valueOf(st.nextToken());
        }

        int m = Integer.valueOf(br.readLine());
        Long[] checkLongArr = new Long[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();

        for(int i=0; i<m; i++){
            String str = st2.nextToken();
            checkLongArr[i] = Long.valueOf(str);
            hashMap.put(str, 0);
        }

        for(int i = 0; i<n; i++){
            if(hashMap.get(longArr[i].toString()) != null)
                hashMap.put(longArr[i].toString(), hashMap.get(longArr[i].toString())+1);
        }

        for(int i=0; i<m; i++){
            bw.write(hashMap.get(checkLongArr[i].toString())+" ");
        }
        bw.flush();

    }
}
