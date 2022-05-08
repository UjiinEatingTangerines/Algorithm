import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if(str != null && str.length() != 0){
                bw.write(str);
                bw.newLine();
            }else{
                break;
            }
        }

        bw.flush();
    }
}
