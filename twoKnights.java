import java.util.Scanner;

public class twoKnights {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){

            long total = (long)i * i;
            long allPairs = (total * (total - 1)) / 2;

            long attackingPair = 4 * (i - 1) * (i - 2);

            System.out.println(allPairs - attackingPair);
        }
    }
}
