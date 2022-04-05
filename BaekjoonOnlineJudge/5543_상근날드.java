import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] bugerArr = new int[3];
        ArrayList colaArr = new ArrayList();

        for(int i=0; i<5; i++){
            if(i <3) bugerArr[i] = Integer.parseInt(br.readLine());
            else colaArr.add(Integer.parseInt(br.readLine()));
        }

        colaArr.sort(Comparator.naturalOrder());
        Arrays.sort(bugerArr);

        bw.write(String.valueOf((bugerArr[0]+Integer.parseInt(String.valueOf(colaArr.get(0))))-50));
        bw.flush();

    }

}