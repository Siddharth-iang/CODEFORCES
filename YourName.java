import java.util.*;

public class Your{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q-- > 0){
            int n = sc.nextInt();
            sc.nextLine();

            String s = sc.nextLine();
            String t = sc.nextLine();

            if(s.length()!= t.length()){
                System.out.println("NO");
                continue;
            }

            HashMap<Character,Integer> map = new HashMap<>();

            for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c,0) + 1);
            }

            boolean isAnagram = true;

            for(char c: t.toCharArray()){
                if(!map.containsKey(c)){
                    isAnagram = false;
                    break;
                }

                map.put(c, map.get(c)-1);
                    if(map.get(c) < 0){
                        isAnagram = false;
                        break;
                    }
            }
            System.out.println(isAnagram? "YES":"NO");
        }
    }
}
