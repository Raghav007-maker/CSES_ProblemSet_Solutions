import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(n == 2 || n == 3){
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sb.append(i).append(" ");
            }
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
