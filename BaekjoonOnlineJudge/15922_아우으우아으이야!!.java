import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    int[] arr;
    int firstNumber = 0;
    int secondNumber = 0;
    int index = 0;

    void solution(int a, int b){

        int result = 0;


        if(secondNumber < a) {
            firstNumber = a;
            secondNumber = b;
            index++;
        }

        if(secondNumber < b) secondNumber = b;

        if(firstNumber < 0 && secondNumber <= 0) result = Math.abs(firstNumber) - Math.abs(secondNumber);
        if(firstNumber < 0 && secondNumber >= 0) result = Math.abs(firstNumber) + Math.abs(secondNumber);
        if(firstNumber >= 0 && secondNumber > 0) result = secondNumber - firstNumber;

        arr[index] = result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Main main = new Main();
        main.arr = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(i == 0) {
                main.firstNumber = a;
                main.secondNumber = b;
                main.solution(a,b);
            }
            else main.solution(a,b);
        }

        bw.write(String.valueOf(Arrays.stream(main.arr).sum()));
        bw.flush();

    }

}