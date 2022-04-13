import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int mingukscore = 0;
        int manseScore = 0;

        int result = 0;

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<4; j++){
                if(i == 0) mingukscore += Integer.parseInt(st.nextToken());
                else manseScore += Integer.parseInt(st.nextToken());
            }

            result = mingukscore;
            if(mingukscore < manseScore) result = manseScore;
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
