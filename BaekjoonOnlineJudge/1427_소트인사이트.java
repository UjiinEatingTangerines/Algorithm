import java.io.*;
import java.util.Arrays;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);

        for(int i=strArray.length-1; i >= 0; i--){
            bw.write(strArray[i]);
        }
        bw.flush();
    }
}
