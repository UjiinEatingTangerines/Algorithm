import java.io.*;

public class Main {

    char[] charArr = {'p','P','A','p'};

    public int solution(String str, int nowIndex){

        int index = nowIndex;

        for (int i = 0; i < 4; i++) {
            if(str.charAt(i+nowIndex) != charArr[i]) break;
            else if(i == 3) index = nowIndex+3;
        }

        return index;
    }


    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        String str = br.readLine();
        int count = 0;
        Main main = new Main();

        //사과 A, 파인애플 P, 펜 p
        //pPap
        if(n > 4) {
            for (int i = 0; i < n; i++) {
                if(i < n-2 && str.charAt(i) == 'p'){
                    int solutionNumber = main.solution(str, i);
                    count = solutionNumber == i ? count : count+1;
                    i = solutionNumber;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

    }
}