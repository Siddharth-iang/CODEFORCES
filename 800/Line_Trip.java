import java.util.*;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextInt();
            int x = sc.nextInt();

            ArrayList<Integer> points = new ArrayList<>();
            points.add(0);

            for(int i=1; i<=n; i++){
                int point = sc.nextInt();
                points.add(point);
            }

            points.add(x);
            int N = points.size();

            int maxDistanceBetweenTwoPoints = Integer.MIN_VALUE;

            for(int i=1; i<N; i++){
                if(i == N-1){
                   maxDistanceBetweenTwoPoints = Math.max(maxDistanceBetweenTwoPoints, 2*(points.get(i) - points.get(i-1)));
                }

                else{
                    maxDistanceBetweenTwoPoints = Math.max(maxDistanceBetweenTwoPoints, points.get(i)-points.get(i-1));
                }
            }

            System.out.println(maxDistanceBetweenTwoPoints);
        }
    }
    
}
