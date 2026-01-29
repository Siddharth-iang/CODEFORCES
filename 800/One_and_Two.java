import java.util.Scanner;

public class One_and_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int totalTwos = 0;
            for(int i=0; i<n; i++){
                if(a[i]==2){
                    totalTwos++;
                }
            }

            if(totalTwos%2!=0){
                System.out.println(-1);
                continue;
            }

            int leftTwos = 0;
            long ans = -1;
            for(int i=0; i<n-1; i++){
                if(a[i]==2){
                    leftTwos++;
                }

                int rightTwos = totalTwos - leftTwos;
                if(leftTwos == rightTwos){
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
