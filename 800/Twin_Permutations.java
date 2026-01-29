//Can also be solved using complex method like creating copy of array

import java.util.*;

public class Twin_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                int b_i = (n+1)-a[i];
                System.out.print(b_i + " ");;
            }
        }
    }
}
