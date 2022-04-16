import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if(str.equals("N") || str.equals("n")){
            bw.write("Naver D2");
        }else{
            bw.write("Naver Whale");
        }
        bw.flush();

    }
}
