import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            hashMap.put(st.nextToken(), st.nextToken());

        }

        Object[] arr = hashMap.keySet().toArray();
        Arrays.sort(arr, Collections.reverseOrder());

        //for(String str : hashMap.keySet()){
        for(Object str : arr){
            if(hashMap.get(str).equals("enter")) {
                bw.write(String.valueOf(str));
                bw.newLine();
            }
        }
        bw.flush();
    }
}