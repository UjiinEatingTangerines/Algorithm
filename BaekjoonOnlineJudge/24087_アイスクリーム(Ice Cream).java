import java.io.*;

public class Mains {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int result = a;
        int count = 0;

        while (true){

            if(result >= s) break;
            result += b;
            count++;

        }

        bw.write(String.valueOf(250 + (100*count)));
        bw.flush();

    }
}