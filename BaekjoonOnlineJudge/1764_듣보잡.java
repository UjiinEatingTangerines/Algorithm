import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.valueOf(st.nextToken()); //not listen
        int m = Integer.valueOf(st.nextToken()); //not see

        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            String str = br.readLine();
            if(i < n) hashMap.put(str, str);
            else{
                if(hashMap.get(str)!=null){
                    arrayList.add(str);
                }
            }
        }
        Collections.sort(arrayList);

        bw.write(String.valueOf(arrayList.size()));
        bw.newLine();
        Stream<String> stream = arrayList.stream();
        stream.forEach( sortedString -> {
            try {
                bw.write(sortedString);
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();

    }
}