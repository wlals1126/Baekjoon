import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

// 옆집삼식이
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        int cnt = 0;
        int llen = str.length();
        if(llen != 1) {
            while(true) {
                int len = str.length();
                if(len == 1)
                    break;
                res = 0;
                for(int i = 0; i < len; i++) {
                    char ch = str.charAt(i);
                    res += Integer.parseInt(String.valueOf(ch));
                }
                str = String.valueOf(res);
                cnt++;
            }
        }
        else {
            res = Integer.parseInt(str);
        }
        System.out.println(cnt);
        if(res % 3 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
