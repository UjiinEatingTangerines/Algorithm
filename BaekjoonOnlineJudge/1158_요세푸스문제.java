import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    void solution (int N, int K) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        ArrayList arrayList = new ArrayList();

        for(int i=1; i<=N; i++){
            arrayList.add(i);
        }

        int count = K-1;
        int check = 0;

        while (true){
            if(check == N) break;

            if(count >= arrayList.size()) count = count % arrayList.size();

            sb.append(" "+arrayList.get(count)+",");
            arrayList.remove(count);
            check++;
            count += K-1;

        }

        sb.deleteCharAt(1);
        sb.deleteCharAt(sb.length()-1);

        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //인원수
        int K = Integer.parseInt(st.nextToken()); //지울대상의 번째

        Main main = new Main();
        main.solution(N,K);

    }

}