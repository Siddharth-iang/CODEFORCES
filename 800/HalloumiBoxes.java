import java.util.*;

public class HalloumiBoxes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // Read the number of test cases
		while (t-- > 0) {
                      int n = sc.nextInt();
                      int k = sc.nextInt();

                      int a[] = new int[n];
                      for(int i=0; i<n; i++){
                        a[i] = sc.nextInt();
                      }

                      int copy_a[] = Arrays.copyOf(a, a.length);
                      Arrays.sort(copy_a);

                      if(k > 1 || Arrays.equals(a, copy_a)){
                        System.out.println("YES");
                      }

                      else{
                        System.out.println("NO");
                      }
               }

      }
}
             

