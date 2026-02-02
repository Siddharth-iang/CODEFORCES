//This problem forked my time

import java.util.HashSet;
import java.util.Scanner;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xk = sc.nextInt();
            int yk = sc.nextInt();

            int xq = sc.nextInt();
            int yq = sc.nextInt();

            int dX[] = {a,b,a,b,-a,-a,-b,-b};
            int dY[] = {b,a,-b,-a,b,-b,a,-a};

            HashSet<String> kingAttackerPos = new HashSet<>();
            HashSet<String> queenAttackerPos = new HashSet<>();

            for(int i=0; i<8; i++){
                kingAttackerPos.add((xk+dX[i]) + "," + (yk+dY[i]));
                queenAttackerPos.add((xq+dX[i]) + "," + (yq+dY[i]));
            }

            int count = 0;
            for(String pos: kingAttackerPos){
                if(queenAttackerPos.contains(pos)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
