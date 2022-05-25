import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            for (int j = 1; j <= n; j++) {
                if(i == 0 || j == 0) continue;
                sum += Integer.valueOf(st2.nextToken());
                arr[i][j] = sum;
            }
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            StringTokenizer st3 = new StringTokenizer(str, " ");

            int x1 = Integer.valueOf(st3.nextToken());
            int y1 = Integer.valueOf(st3.nextToken());
            int x2 = Integer.valueOf(st3.nextToken());
            int y2 = Integer.valueOf(st3.nextToken());

            int result = 0;

            for (int j = x1; j <= x2; j++) {
                int change_x = j;
                int change_y = y1-1;

                if(change_y == 0){
                    change_x = change_x-1;
                    change_y = n;
                }

                result += arr[j][y2]-arr[change_x][change_y];
            }

            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();

    }
}