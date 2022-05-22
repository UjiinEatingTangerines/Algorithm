import java.io.*;
import java.util.*;


public class Q3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> chess = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            chess.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> stdchess = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,8)); //체스말의 기본 갯수

        for (int i = 0; i < 6; i++) {
            int result;
            result = stdchess.get(i) - chess.get(i);
            System.out.print(result+" ");
        }

    }

}