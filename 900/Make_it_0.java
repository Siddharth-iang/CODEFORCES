import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Make_it_0 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long a[] = new long[n];
            for(int i=0; i<n; i++){
<<<<<<< HEAD
                st.nextToken();
            }

            if(n%2==0){
                out.println(2);
                out.println(1 +  " " + n);
                out.println(1 + " " + n);
            }

            else{
                out.println(4);
                out.println(1 +  " " + (n-1));
                out.println(1 + " " + (n-1));
                out.println((n-1) + " " + n);
                out.println((n-1) + " " + n);
            }
        }
        out.flush();
        out.close();
=======
                a[i] = Long.parseLong(st.nextToken());
            }

            if(n%2==0){
                System.out.println(2);
                System.out.println(1 +  " " + n);
                System.out.println(1 + " " + n);
            }

            else{
                System.out.println(4);
                System.out.println(1 +  " " + (n-1));
                System.out.println(1 + " " + (n-1));
                System.out.println((n-1) + " " + n);
                System.out.println((n-1) + " " + n);
            }
        }
>>>>>>> 53f35e294d1f32749f47e8818f869a1a2bb98d7f
    }
}
