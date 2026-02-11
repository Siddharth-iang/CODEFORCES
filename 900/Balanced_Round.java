<<<<<<< HEAD
=======
// Very hard implementation in JAVA..... Literally got accepted after 13 submissions !

>>>>>>> 53f35e294d1f32749f47e8818f869a1a2bb98d7f
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Balanced_Round {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long a[] = new long[n];
            for(int i=0; i<n; i++){
                a[i] = Long.parseLong(st.nextToken());
            }

            Random rnd = new Random();
            for (int i = 0; i < n; i++) {
                int j = rnd.nextInt(n);
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

          Arrays.sort(a);

          long count = 1;
          long maxLength = 1;
          
          for(int i=1; i<n; i++){
            if(a[i] - a[i-1] <= k){
                count++;
            }
            else{
                count = 1;
            }

            if(count > maxLength) maxLength = count;
          }

          out.println(n - maxLength);
        }
        out.flush();
        out.close();
    }
}
