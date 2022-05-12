import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    int[] intArrCount = {0,1,2,3};

    public void solution(int number){
        if(number == 0) intArrCount = new int[]{0, 1, 2, 3};
        else if(number == 1) intArrCount = new int[]{2, 0, 3, 1};
        else if(number == 2) intArrCount = new int[]{3, 2, 1, 0};
        else if(number == 3) intArrCount = new int[]{1, 3, 0, 2};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Main main = new Main();

        int[] intArr = new int[4];

        intArr[0] = Integer.valueOf(st.nextToken());
        intArr[1] = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        intArr[2] = Integer.valueOf(st.nextToken());
        intArr[3] = Integer.valueOf(st.nextToken());

        int[][] arr = new int[2][2];
        double[] resultArr = new double[4];
        // A/C + B/D
        for(int i=0; i<4; i++){
            main.solution(i);
            arr[0][0] = intArr[main.intArrCount[0]];
            arr[0][1] = intArr[main.intArrCount[1]];
            arr[1][0] = intArr[main.intArrCount[2]];
            arr[1][1] = intArr[main.intArrCount[3]];
            resultArr[i] = (Double.valueOf(arr[0][0])/Double.valueOf(arr[1][0]))+(Double.valueOf(arr[0][1])/Double.valueOf(arr[1][1]));
        }

        double maxNumber = resultArr[0];
        double minNumber = resultArr[0];
        int maxcountNumber = 0;
        int mincountNumber = 0;

        for(int i=1; i<4; i++){
            if(maxNumber < resultArr[i]) {
                maxNumber = resultArr[i];
                maxcountNumber = i;
            }

            if(minNumber > resultArr[i]){
                minNumber = resultArr[i];
                mincountNumber = i;
            }
        }

        Arrays.sort(resultArr);

        for(int i=0; i<3; i++){
            if(maxNumber == resultArr[i]){
                maxcountNumber = mincountNumber;
                break;
            }
        }

        bw.write(String.valueOf(maxcountNumber));
        bw.flush();

    }
}
