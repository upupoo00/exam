package Java0524;


/**
 * 美国节日：https://www.nowcoder.com/questionTerminal/d95d98a2f96e49078cd7df84ba0c9d79
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int y=in.nextInt();
            int mon[]=new int[]{1,2,5,9,11};
            int len=mon.length;
            int wek[]=new int[len];
            // 创建 Calendar 对象
            Calendar cal = Calendar.getInstance();
            try {
                // 对 calendar 设置时间的方法
                // 设置传入的时间格式
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
                for (int i = 0; i < len; i++) {// 指定一个日期
                    Date date = dateFormat.parse(y+"-"+mon[i]+"-1");
                    cal.setTime(date);// 对 calendar 设置为 date 所定的日期
                    int week = cal.get(Calendar.DAY_OF_WEEK)-1; //每月1号位于星期几
                    if(week==0) week=7;
                    wek[i]=week;
//                  System.out.println(week);
                }
            } catch (Exception e) {

            }

            System.out.println(y+"-01-01");

            //1月的第三个星期一
            int jan=wek[0];
            int rs=0;
            String strRs="";
            if(jan==1){
                rs=2*7+1;
            }
            else{
                rs=3*7-(jan-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-01-"+strRs);

            //2月的第三个星期一
            int feb=wek[1];
            if(feb==1){
                rs=2*7+1;
            }
            else{
                rs=3*7-(feb-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-02-"+strRs);

            //5月的最后一个星期一(星期一：一个月（4~5次）)
            int may=wek[2];
            if(may>=6){//第五个星期一
                rs=may==6?31:30;
            }
            else{//第四个星期一
                rs=4*7-(may-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-05-"+strRs);

            System.out.println(y+"-07-04");

            //9月的第一个星期一
            int sep=wek[3];
            if(sep==1){
                rs=1;
            }
            else{
                rs=1*7-(sep-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-09-"+strRs);

            //11月的第四个星期四
            int nov=wek[4];
            rs=4*7-(nov-1)+1+3;
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-11-"+strRs);

            System.out.println(y+"-12-25");
            System.out.println();
        }
    }
}
