import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        String result = "";
        for(int i=0; i<arr[0].length(); i++){
            int count = 0;
            int j_number = 0;
            for(int j=0; j<n-1; j++){
                if(arr[j].charAt(i) != arr[j+1].charAt(i)){
                    count++;
                    j_number = j;
                    result+="?";
                    break;
                }
            }
            if(count == 0) result += arr[j_number].charAt(i);
        }
        bw.write(result);
        bw.flush();
    }
}
