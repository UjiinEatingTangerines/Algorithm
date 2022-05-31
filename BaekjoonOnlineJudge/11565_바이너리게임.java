import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length(); i++) {
            sumA += Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        for (int i = 0; i < b.length(); i++) {
            sumB += Integer.parseInt(String.valueOf(b.charAt(i)));
        }

        if(sumA >= sumB) bw.write("VICTORY");
        else {
            if((sumA+2)%2==1 && sumA+1 == sumB){
                bw.write("VICTORY");
            }else{
                bw.write("DEFEAT");
            }
        }

        bw.flush();

    }
}