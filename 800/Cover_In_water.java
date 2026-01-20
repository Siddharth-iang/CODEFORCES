import java.util.*;

public class Cover_In_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            boolean checkThreeDots = false;
            int count = 0;

            for(int i=0; i<n; i++){
                if(s.charAt(i)=='.' && (i+1)<n && s.charAt(i+1)=='.' &&(i+2)<n && s.charAt(i+2)=='.'){
                    checkThreeDots = true;
                    break;
                }

                if(s.charAt(i)=='.'){
                    count++;
                }
            }

            if(checkThreeDots){
                System.out.println(2);
            }

            else{
                System.out.println(count);
            }
        }
    }
}
