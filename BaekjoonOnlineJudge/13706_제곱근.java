import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger n = new BigInteger(br.readLine());
        BigInteger numberTwo = new BigInteger("2"); //나눗셈용
        BigInteger left = new BigInteger("0"); //최소 단위
        BigInteger right = new BigInteger(String.valueOf(n)); //최대 단위

        while (true){
            BigInteger mid = left.add(right).divide(numberTwo);
            BigInteger midMultiply = mid.multiply(mid);
            if(midMultiply.compareTo(n) == 0){
                bw.write(String.valueOf(mid));
                bw.newLine();
                break;
            }else if(midMultiply.compareTo(n) == -1){
                left = mid;
            }else{
                right = mid;
            }

        }
        bw.flush();

    }

}