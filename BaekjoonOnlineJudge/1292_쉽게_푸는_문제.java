import java.io.*;
import java.util.StringTokenizer;

public class Main {

    int foundStartFirstNumber(int number){
        if(number == 1) {
            return 1;
        } else  {
            return foundStartFirstNumber(number-1) + (number-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Main main = new Main();

        int firstNumber = Integer.parseInt(st.nextToken()); //3
        int secondNumber = Integer.parseInt(st.nextToken());//7

        int result = 0;

        for(int i=1; i<1000; i++){
            int check = main.foundStartFirstNumber(i);
            if(firstNumber>=check && firstNumber < check+i){
                for(int j=firstNumber; j<check+i; j++){
                    firstNumber++;
                    result += i;
                    if(firstNumber == secondNumber+1) break;
                }
            }

            if(firstNumber == secondNumber+1) break;
        }

        bw.write(String.valueOf(result));
        bw.flush();


    }
}
