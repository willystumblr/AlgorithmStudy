import java.io.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class N1 {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        Integer[] pplI = new Integer[N];
        for (int i=0;i<N;i++){
            pplI[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pplI);

        Integer ppl=0;
        Integer group=0;
        for(int i=0;i<N;i++) {
            ppl++;
            if (ppl >= pplI[i]) {
                group++;
                ppl = 0;
            }
        }
        bw.write(group.toString());
        bw.flush();

    }
}
