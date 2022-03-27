import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int result = (a*8)+(b*3);

        if(28 > result) result = 28-result;
        else result = result - 28;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
