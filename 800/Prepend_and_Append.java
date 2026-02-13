import java.io.*;
import java.util.*;

public class Prepend_and_Append {
    public static void main(String[] args) {
        FastReader fr = new FastReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();

        while(t-->0){
            int n = fr.nextInt();
            String s = fr.next();

            int i=0;
            int j=n-1;
            int result = n;

            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    result = result - 2;
                }

                else{
                    break;
                }
                i++;
                j--;
            }
            out.println(result);
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
