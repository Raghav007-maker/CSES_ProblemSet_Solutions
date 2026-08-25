// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Repetitions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int l = 0;
        int r = 0;
        long maxLength = 0;
        int n = s.length();
        while(r < n){

            if(s.charAt(l) != s.charAt(r)){
                l = r;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        System.out.println(maxLength);
        sc.close();
    }
}