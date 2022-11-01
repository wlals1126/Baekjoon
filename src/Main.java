import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        for(int i = 1; i <= c; i++) {
            a %= b;
            a *= 10;
            temp = a / b;
        }
        System.out.println(temp);
    }
}


