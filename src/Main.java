import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://velog.io/@suw0n/11723JAVA
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[20];
        String s;
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            if(s.equals("all") || s.equals("empty")) {
                if (s.contains("a"))
                    for (int i = 0; i < 20; i++)
                        arr[i] = true;
                else
                    for (int i = 0; i < 20; i++)
                        arr[i] = false;
            }
            else {
                n = Integer.parseInt(st.nextToken());
                if(s.contains("a"))
                    arr[n-1] = true;
                else if(s.contains("r"))
                    arr[n-1] = false;
                else if(s.contains("c"))
                    sb.append((arr[n-1] == true ? 1 : 0) + "\n");
                else arr[n-1] = !arr[n-1];
            }
            m--;
        }
        System.out.println(sb);
    }
}
