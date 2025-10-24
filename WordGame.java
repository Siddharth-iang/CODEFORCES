import java.util.*;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            sc.nextLine();

            String[] p1words = sc.nextLine().split(" ");
            String[] p2words = sc.nextLine().split(" ");
            String[] p3words = sc.nextLine().split(" ");

            solve(n,p1words,p2words,p3words);
        }
    }

    public static void solve(int n, String[] p1words, String[] p2words, String[] p3words){
        HashMap<String,Integer> wordFrequency = new HashMap<>();

        updateFrequency(p1words, wordFrequency);
        updateFrequency(p2words, wordFrequency);
        updateFrequency(p3words, wordFrequency);

        int score1 = countScore(p1words,wordFrequency);
        int score2 = countScore(p2words,wordFrequency);
        int score3 = countScore(p3words,wordFrequency);
        

        System.out.println(score1 + " " + score2 + " " + score3);
    }

    public static void updateFrequency(String[] words, Map<String, Integer>freqMap){
        for(String word: words){
            freqMap.put(word, freqMap.getOrDefault(word,0) + 1);
        }
    }

    public static int countScore(String[] words, Map<String,Integer>freqMap){
        int score = 0;

        for(String word: words){
            int count = freqMap.get(word);
            if(count == 1){
                score+=3;
            }

            else if(count==2){
                score+=1;
            }

            else if(count ==3){
                score+=0;
            }
        }
        return score;
    }
}
