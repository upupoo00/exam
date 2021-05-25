package Java0525;

import java.util.Scanner;

/**
 * 淘宝网店：https://www.nowcoder.com/questionTerminal/754921e9c98b43d1b2d70c227b844101
 */
public class Main {
    //非闰年为标准
    static int[] totalday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //非闰年 - 每个月的总收益
    static int[] totalMoney = {62, 28, 31, 60, 31, 60, 31, 62, 60, 62, 30, 62};
    //判断该月份是否为素数
    public static boolean Judge_IsPriNum(int month){
        if(month == 2 || month == 3 || month == 5 || month == 7 ||
                month == 11){
            return true;
        }
        return false;
    }

    //判断该年份是否为闰年
    public static boolean Judge_IsLeaYear(int year){
        if( (year % 4 == 0 && year % 100 != 0) ||
                year % 400 == 0){
            return true;
        }
        return false;
    }

    //计算相差day2 - day1天数的收益
    public static int Caclue_Day(int day1, int day2, int month){
        //1 - 31， 是31天    31 - 1 = 30 -- 得加1
        int sum = day2 - day1 + 1;
        if(!Judge_IsPriNum(month)){
            //非素数一天赚2块
            sum += sum;
        }
        return sum;
    }

    //计算相差month2 - month1 整月数的收益
    public static int Caclue_Month(int month1, int month2, int year){
        int sum = 0;
        for(int i = month1; i <= month2; ++i){
            //下标-1
            sum += totalMoney[i - 1];
            //2月 - 闰年 - 多加1块
            if(i == 2 && Judge_IsLeaYear(year)){
                sum += 1;
            }
        }
        return sum;
    }

    //计算相差year2 - year1 整年数的收益
    public static int Caclue_Year(int year1, int year2){
        int sum = 0;
        for(int i = year1; i <= year2; ++i){
            sum += Caclue_Month(1, 12, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        //定义接受的年月日
        Scanner scanner = new Scanner(System.in);
        int year1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();
        while(scanner.hasNext()){
            //由于是整数 还是 是空格分隔， 采用cin就可以
            int total_num = 0;

            if(year1 == year2){
                //同一年份
                if(month1 == month2){
                    //同一月份
                    total_num =  Caclue_Day(day1, day2, month1);
                }
                else{
                    //不同月份
                    //1、先计算两者相差整月份的收益
                    total_num += Caclue_Month(month1, month2, year1);
                    //2、month1首月不足一月的天数收益
                    total_num += Caclue_Day(day1, totalday[month1 - 1], month1);
                    //3、month2尾月不足一月的天数收益
                    total_num += Caclue_Day(1, day2, month2);
                }
            }
            else{
                //不同年份
                //1、先计算两者相差整年份的收益
                total_num += Caclue_Year(year1 + 1, year2 - 1);
                //2、year1年份不足一年整月份的收益
                total_num += Caclue_Month(month1 + 1, 12, year1);
                //3、year2年份不足一年整月份的收益
                total_num += Caclue_Month(1, month2 - 1, year2);
                //4、year1中首月不足一月的收益
                total_num += Caclue_Day(day1, totalday[month1 - 1], month1);
                //5、year2中尾月不足一月的收益
                total_num += Caclue_Day(1, day2, month2);
            }

            //输出
            System.out.println(total_num);
        }
    }
}
