import java.io.*;

public class Main {


    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder frontIndexStringBuilder = new StringBuilder();
        StringBuilder backIndexStringBuilder = new StringBuilder();

        String[] arr = str.split(String.valueOf(str.charAt(0)));

        if(arr.length == 0){
            bw.write("-1");
        }else{
            for (int i = 0; i < str.length() / 2; i++) {
                frontIndexStringBuilder.append(str.charAt(i));
            }

            for (int i = str.length()-1; i > (str.length()-1)/2; i--) {
                backIndexStringBuilder.append(str.charAt(i));
            }

            if(frontIndexStringBuilder.toString().equals(backIndexStringBuilder.toString())){
                bw.write(String.valueOf(str.length()-1));
            }else{
                bw.write(String.valueOf(str.length()));
            }
        }

        bw.flush();

    }
}