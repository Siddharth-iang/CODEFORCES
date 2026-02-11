//No Chemistry just pure Math

import java.util.*;
public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            HashMap<Character,Integer> map = new HashMap<>();


            for(char c: s.toCharArray()){
               map.put(c, map.getOrDefault(c, 0)+1);
            }

            int odd_freq = 0;

            for(int count: map.values()){
                if(count%2!=0){
                    odd_freq++;
                }
            }

            if(odd_freq > k+1){
                    System.out.println("NO");
            }

            else{
                    System.out.println("YES");
            }
        }
    }
}
