import java.util.Scanner;

public class Ever_like_good_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            long operationsCount = 0;
            for(int i = 0; i < n - 1; i++){
                if((a[i] % 2) == (a[i+1] % 2)){
                    operationsCount++;
                }
            }
            System.out.println(operationsCount);
        }
        sc.close();
    }
}
