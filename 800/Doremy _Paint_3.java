import java.util.*;

public class Doremy_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                int a = sc.nextInt();
                map.put(a, map.getOrDefault(a,0) + 1);
            }

            int f1 = 0;
            int f2 = 0;
            for(int c: map.values()){
                if(c>f1){
                    f2=f1;
                    f1=c;
                }

                else if(c>f2){
                    f2=c;
                }
            }
            
            if(Math.abs(f1-f2) <= 1){
                System.out.println("YES");
            }
            
            else{
                System.out.println("NO");
            }
        }
    }
}
