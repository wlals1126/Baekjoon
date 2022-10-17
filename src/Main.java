import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

// 옆집삼식이
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("%d\n", a+b);
        }
    }
}
