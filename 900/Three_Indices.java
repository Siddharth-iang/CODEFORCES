import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Three_Indices {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int p[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }

            boolean found = false;

            for(int j=1; j<(n-1); j++){
                if((p[j-1] < p[j]) && (p[j] > p[j+1])){
                    out.println("YES");
                    out.println((j) + " " + (j+1) + " " + (j+2));
                    found = true;
                    break;
                }
            }
            if(!found){
                out.println("NO");
            }
        }
        out.flush();
        out.close();
    }
}
