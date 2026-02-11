import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            int zeroesCount = 0;
            int onesCount = 0;

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    zeroesCount++;
                }
                else{
                    onesCount++;
                }
            }

            int operations = Math.min(zeroesCount,onesCount);

            if(operations%2==0){
                System.out.println("NET");
            }
            else{
                System.out.println("DA");
            }
        }
    }
}