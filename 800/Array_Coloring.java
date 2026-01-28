<<<<<<< HEAD
import java.util.HashMap;
import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                map.put(a[i], map.getOrDefault(a[i],0)+1);
            }
            
            int count = 0;

            for(int key:map.keySet()){
                if(key%2!=0){
                    count = count + map.get(key);
                }
            }

            if(count%2==0){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }
    }
}
=======
// Calculate sum of all the elements at end of the day

import java.util.HashMap;
import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                map.put(a[i], map.getOrDefault(a[i],0)+1);
            }
            
            int count = 0;

            for(int key:map.keySet()){
                if(key%2!=0){
                    count = count + map.get(key);
                }
            }

            if(count%2==0){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }
    }
}

>>>>>>> 28d2e68a73a81d7e84ac95f153db0b93eba5e229
