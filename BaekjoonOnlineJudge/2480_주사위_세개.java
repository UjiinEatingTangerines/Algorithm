import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;
        int index = 0;
        int result = 0;
        Boolean[] bArr = {true,true,true};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(bArr[j]){
                    if(i == j) continue;
                    if(arr[i] == arr[j]) {
                        count+=1;
                        index = arr[i];
                        bArr[i] = false;
                        bArr[j] = false;
                    }
                }
            }
            if(count == 2){
                break;
            }

        }

        if(count == 0){
            result = arr[2]*100;
        }else if(count == 1){
            result = 1000+(index*100);
        }else{
            result = 10000+(index*1000);
        }

        bw.write(String.valueOf(result));
        bw.flush();


    }

}
