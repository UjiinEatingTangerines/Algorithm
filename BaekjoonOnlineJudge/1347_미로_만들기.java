import java.io.*;

public class Main {

    private static int fist_arrIndex = 75;
    private static int second_arrIndex = 75;
    private static String status = "down";
    private static char[][] arr = new char[150][150];
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int lastLeft = 75;
    private static int lastRight = 75;
    private static int fistFloor = 75;
    private static int lastFloor = 75;

    private static void R_solution(String parameterStatus){
        if(parameterStatus.equals("down")){
            status = "left";
        }else if(parameterStatus.equals("right")){
            status = "down";
        }else if(parameterStatus.equals("left")){
            status = "up";
        }else{
            status = "right";
        }
    }
    private static void L_solution(String parameterStatus){
        if(parameterStatus.equals("down")){
            status = "right";
        }else if(parameterStatus.equals("right")){
            status = "up";
        }else if(parameterStatus.equals("left")){
            status = "down";
        }else{
            status = "left";
        }
    }
    private static void F_solution(String parameterStatus) throws IOException {
        if(parameterStatus.equals("down")){
            ++fist_arrIndex;
        }else if(parameterStatus.equals("right")){
            ++second_arrIndex;
        }else if(parameterStatus.equals("left")){
            --second_arrIndex;
        }else{//up
            --fist_arrIndex;
        }

        if(fistFloor > fist_arrIndex){
            fistFloor = fist_arrIndex;
        }

        if(lastLeft > second_arrIndex){
            lastLeft = second_arrIndex;
        }

        if(lastRight < second_arrIndex){
            lastRight = second_arrIndex;
        }

        if(lastFloor < fist_arrIndex){
            lastFloor = fist_arrIndex;
        }

        arr[fist_arrIndex][second_arrIndex] = '.';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String action = br.readLine();

        arr[fist_arrIndex][second_arrIndex] = '.';

        for(int i=0; i<action.length(); i++){
            if(action.charAt(i) == 'R'){
                R_solution(status);
            }else if(action.charAt(i) == 'L'){
                L_solution(status);
            }else if(action.charAt(i) == 'F'){
                F_solution(status);
            }
        }

        for(int i=fistFloor; i<=lastFloor; i++){
            for(int j=lastLeft; j<=lastRight; j++){
                if(arr[i][j] == '.'){
                    bw.write(String.valueOf(arr[i][j]));
                }else{
                    bw.write(String.valueOf('#'));
                }
            }
            bw.newLine();
        }
        bw.flush();

    }

}
