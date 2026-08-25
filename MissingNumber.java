import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long expectedSum = ((long)n * (n + 1))/2;
        long currSum = 0;
        for(int i = 0; i < n - 1; i++){
            currSum += sc.nextInt();
        }

        System.out.println(expectedSum - currSum);
        sc.close();
    }
}
