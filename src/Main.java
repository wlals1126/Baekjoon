import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = 1;
        int[][] arr = new int[50][200];
        String[] st;
        for(int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(st[0]);
            arr[i][1] = Integer.parseInt(st[1]);
        }
        for(int i = 0; i < n; i++) {
            temp = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    temp++;
                }
            }
            System.out.print(temp + " ");
        }
    }
}