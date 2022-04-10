import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            ArrayList<String> stringArrayList = new ArrayList<>();
            HashMap<String,String> hashMap = new HashMap<>();

            for(int i=0; i<n; i++){
                String str = br.readLine();
                String lowerStr = str.toLowerCase();

                stringArrayList.add(lowerStr);
                hashMap.put(lowerStr,str);
            }

            stringArrayList.sort(Comparator.naturalOrder());

            bw.write(hashMap.get(stringArrayList.get(0)));
            bw.newLine();
        }
        bw.flush();

    }
}