import java.util.*;

public class Colorblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();

            String row1 = sc.nextLine();
            String row2 = sc.nextLine();

            if(rows(n,row1,row2)){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }  
    }

    public static boolean rows(int n, String row1, String row2){

        for(int i=0; i<n; i++){
            char c1 = row1.charAt(i);
            char c2 = row2.charAt(i);

            if(c1 == 'R' && c2 == 'R'){
                continue;
            }

            else if(c1=='R' || c2 == 'R'){
                return false;
           }
        }

        return true;
    }
}
