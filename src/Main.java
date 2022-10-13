import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            int tmp = i;
            int sum = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if(sum == n) {
                System.out.printf("%d", i);
                n = 0;
                break;
            }
        }
        if(n != 0) {
            System.out.println("0");
        }
    }
}