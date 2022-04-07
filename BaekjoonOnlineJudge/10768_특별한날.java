import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int monthNumber = Integer.parseInt(br.readLine());
        int dayNumber = Integer.parseInt(br.readLine());

        String result = "After";

        if(monthNumber == 2){
            if(dayNumber == 18) result = "Special";
            else if(dayNumber < 18) result = "Before";
        }
        if(monthNumber < 2) result = "Before";

        bw.write(result);
        bw.flush();

    }
}