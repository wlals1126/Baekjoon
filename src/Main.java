import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언

        /** */
        int monthTotal[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int nowYear = Integer.parseInt(st.nextToken());
        int nowMonth = Integer.parseInt(st.nextToken());
        int nowDay = Integer.parseInt(st.nextToken());

        int endYear = Integer.parseInt(st2.nextToken());
        int endMonth = Integer.parseInt(st2.nextToken());
        int endDay = Integer.parseInt(st2.nextToken());

        /**1000년 초과시 gg*/
        if(nowYear+1000<endYear
                ||(nowYear+1000==endYear&&nowMonth<endMonth)
                ||(nowYear+1000==endYear&&nowMonth==endMonth&&nowDay<=endDay)) {
            bw.write("gg");
        }else {
            /**년도 계산(시작년도,종료년도 포함x)*/
            for(int year = nowYear+1; year<endYear; year++) {
                if(((year%4==0 && year%100!=0)||year%400==0)) { //윤년 체크
                    res = res + 366;
                } else{
                    res = res + 365;
                }

            }
            /**시작년도,종료년도 계산*/
            if(nowYear == endYear) {//시작,종료 년도가 같을때

                if(nowMonth==endMonth) {//시작, 종료 월이 같은경우
                    res = res + (endDay-nowDay);

                }else { //이외(시작월이 더 빠를때)
                    for(int month = nowMonth+1; month<endMonth; month++) {
                        res = res + monthTotal[month];
                    }

                    if(((nowYear%4==0 && nowYear%100!=0) || nowYear%400==0)
                            && nowMonth<=2 && 3<=endMonth){
                        res = res +1;
                    }
                    //시작월
                    res = res + monthTotal[nowMonth-1]-nowDay;
                    //종료월
                    res = res + endDay;
                }
            }else {//시작,종료 년도가 다를때
                for(int month = 0; month<endMonth-1; month++) {
                    res = res + monthTotal[month];
                }

                for(int month = nowMonth; month<12; month++) {
                    res = res + monthTotal[month];
                }

                //시작년도가 윤년이도 시작월이 2월 이전
                if(((nowYear%4==0 && nowYear%100!=0) || nowYear%400==0) && nowMonth<=2){
                    res = res +1;
                }
                //종료년도가 윤년이고 종료월이 3월 이후
                if(((endYear%4==0 && endYear%100!=0) || endYear%400==0) && 3<=endMonth){
                    res = res +1;
                }

                //시작월
                res = res + monthTotal[nowMonth-1]-nowDay;
                //종료월
                res = res + endDay;

            }
            bw.write("D-"+res);
        }
        bw.close();
        br.close();
    }
}