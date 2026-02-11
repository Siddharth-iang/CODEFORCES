// Use Greedy implementation

import java.util.*;
import java.io.*;

public class Swap_Delete {
    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();
        while(t-->0){
           String s = fr.next();

           int zeroesCount = 0;
           int onesCount = 0;

           for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zeroesCount++;
            }
            else{
                onesCount++;
            }
           }
           
           int i=0;
           for(; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                if(onesCount > 0) onesCount--;
                else break;
            }
            else{
                if(zeroesCount > 0) zeroesCount--;
                else break;
            }
           }
           out.println(s.length()-i);
        }
        out.flush();
        out.close();
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

