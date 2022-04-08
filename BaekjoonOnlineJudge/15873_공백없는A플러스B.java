import java.io.*;

public class Mains {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int result = 0;

        if(str.length() == 4){
            result = Integer.parseInt(str.substring(0,2)) + Integer.parseInt(str.substring(2,4));
        } else if(str.length() == 3){
            if(str.substring(1,2).equals("0")) {
                result = Integer.parseInt(str.substring(0,2)) + Integer.parseInt(str.substring(2,3));
            }else{
                result = Integer.parseInt(str.substring(0,1)) + Integer.parseInt(str.substring(1,3));
            }
        } else {
            result = Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(1)));
        }

        bw.write(String.valueOf(result));
        bw.flush();

    }
}