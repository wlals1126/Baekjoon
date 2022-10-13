import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] days  = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int month = sc.nextInt();
        int day = sc.nextInt();
        for(int i = 0; i < month; i++) {
            day += days[i];
        }
        System.out.println(week[day%7]);
    }
}