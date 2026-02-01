import java.util.Scanner;

public class Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int ones = 0;
        int minusOnes = 0;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                ones++;
            }
            else{
                minusOnes++;
            }
        }

        int operations = 0;
        while((ones < minusOnes) || minusOnes%2==1){
            operations++;
            ones++;
            minusOnes--;
         }

         System.out.println(operations);
        }
    }
}
