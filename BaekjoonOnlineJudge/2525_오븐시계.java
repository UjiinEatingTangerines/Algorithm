import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int plusMinute = Integer.parseInt(br.readLine());

        int resultHour = hour;
        int resultMinute = 0;

        if((plusMinute+minute)%60 == 0){
            resultHour = ((plusMinute+minute)/60)+hour;
            resultMinute = 0;
        }else{
            resultHour = ((plusMinute+minute)/60)+hour;
            resultMinute = (plusMinute+minute)%60;
        }

        if(resultHour > 23){
            resultHour = resultHour - 24;
        }

        sb.append(resultHour+" "+resultMinute);
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();


    }
}