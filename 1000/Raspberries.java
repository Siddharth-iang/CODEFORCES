import java.io.*;
import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        FastReader fr = new FastReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();

        while(t-->0){
            int n = fr.nextInt();
            int k = fr.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
           a[i] = fr.nextInt();
        }

        long ans = Integer.MAX_VALUE;
        long evenCount = 0;

        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                evenCount++;
            }
            if(a[i]%k==0){
                ans = 0;
            }
            ans = Math.min(ans, k-a[i]%k);
          }
          if(k==4){
            if(evenCount>=2){
                ans = Math.min(ans,0L);
            }
            else if(evenCount==1){
                ans = Math.min(ans, 1L);
            }
            else if(evenCount==0){
                ans = Math.min(ans,2L);
            }
        }
        System.out.println(ans);
        }
    }
}

class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
