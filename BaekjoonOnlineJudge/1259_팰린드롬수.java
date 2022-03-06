import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        while (Integer.parseInt(str) != 0){

            int count = 0;
            int checkCount = 0;

            for(int i=str.length()-1; i>=0; i--){
                int n = count++;
                if(str.charAt(n) == str.charAt(i)){
                    checkCount++;
                }
            }

            if(checkCount == str.length() && str.charAt(0) != '0') {
                bw.write("yes");
                bw.newLine();
            }else{
                bw.write("no");
                bw.newLine();
            }
            str = br.readLine();
        }
        bw.flush();

    }
}