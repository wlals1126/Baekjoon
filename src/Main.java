import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;

        for(int i = 0; i < n; i++) {
            String word = sc.next();
            boolean a[] = new boolean[26];

            for(int j = 0; j < word.length()-1; j++) {
                if(word.charAt(j) != word.charAt(j+1)) {
                    if(a[word.charAt(j+1)-97] == true) {
                        cnt--;
                        break;
                    }
                }
                a[word.charAt(j)-97] = true;
            }
        }
        System.out.println(cnt);
    }
}
