import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int count_of_zeroes = 0;
            int maximum_length = 0;

            for(int i=0; i<n; i++){
                if(a[i]==0){
                    count_of_zeroes++;
                }
                else{
                    count_of_zeroes = 0;
                }
                 maximum_length = Math.max(maximum_length, count_of_zeroes);
            }

            System.out.println(maximum_length);
        }
    }
}
