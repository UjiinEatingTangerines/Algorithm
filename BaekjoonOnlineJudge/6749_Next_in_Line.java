import java.io.*;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstChildrenOlder = Integer.parseInt(br.readLine());
        int secondChildrenOlder = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((secondChildrenOlder+(secondChildrenOlder-firstChildrenOlder))));
        bw.flush();
    }
}
