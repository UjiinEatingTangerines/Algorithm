import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<n; i++){
            String str = "";
            for(int j=0; j<2*i-1; j++){
                str += "*";
            }

            for(int j=0; j<((2*n-1)-str.length())/2; j++){
                sb.append(" ");
            }
            sb.append(str);
            bw.write(sb.toString());
            bw.newLine();
            sb.delete(0,sb.length());
        }

        for(int i=n; i>0; i--){
            String str = "";
            for(int j=0; j<2*i-1; j++){
                str += "*";
            }

            for(int j=0; j<((2*n-1)-str.length())/2; j++){
                sb.append(" ");
            }
            sb.append(str);
            bw.write(sb.toString());
            bw.newLine();
            sb.delete(0,sb.length());
        }
        bw.flush();

    }
}
