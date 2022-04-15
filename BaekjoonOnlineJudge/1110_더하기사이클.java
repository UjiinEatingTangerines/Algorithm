import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int result = 0;

        String n = br.readLine();
        if(n.length() < 2) n = "0"+n;
        String realNumber = n;

        while (true){

            result = Integer.parseInt(String.valueOf(n.charAt(0)))+Integer.parseInt(String.valueOf(n.charAt(1)));
            if(String.valueOf(result).length() == 2) result = Integer.parseInt(String.valueOf(String.valueOf(result).charAt(1)));
            n = String.valueOf(n.charAt(1)) + String.valueOf(result);

            count++;
            if(realNumber.equals(n)) break;
        }

        bw.write(String.valueOf(count));
        bw.flush();

    }
}
