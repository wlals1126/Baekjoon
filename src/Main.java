import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static boolean Prime (int n) {
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int res = 0;
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(Prime(num)) res++;
        }
        System.out.println(res);
    }
}
