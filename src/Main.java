import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        Arrays.sort(arr); // 리스트 정렬

        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
