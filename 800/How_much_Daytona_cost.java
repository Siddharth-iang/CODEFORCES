import java.util.HashMap;
import java.util.Scanner;

public class How_much_Daytona_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            boolean Check = false;

            for(int i=0; i<n; i++){
                if(a[i]==k){
                    Check = true;
                    break;
                }
            }

            if(Check){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }
    }
}
