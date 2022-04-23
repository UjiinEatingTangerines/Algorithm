import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Character,Integer> hashMap = new HashMap<>();
        int value = 3;

        for(int i=1; i<27; i++){
            char key = (char) (i+64);

            if(i == 19) {
                hashMap.put(key,value++);
                continue;
            }else if(i == 22){
                hashMap.put(key,value++);
                continue;
            }else if(i < 18 && i%3 == 0) {
                hashMap.put(key,value++);
                continue;
            }

            hashMap.put(key,value);
        }

        String str = br.readLine();
        int result = 0;

        for(int i=0; i<str.length(); i++){
            result += hashMap.get(str.charAt(i));
        }

        bw.write(String.valueOf(result));
        bw.flush();

    }
}
