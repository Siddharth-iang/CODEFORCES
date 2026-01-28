import java.util.Scanner;

public class Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n =sc.nextInt();

            int length = 0;
            int firstDig = 0;
            int original = n;

            while(original > 0){
                firstDig = original;
                original = original/10;
                length++;
            }

            int result = 9*(length-1) + firstDig;
            System.out.println(result);
        }
    }
}
