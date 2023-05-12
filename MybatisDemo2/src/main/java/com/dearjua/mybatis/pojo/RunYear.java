package com.dearjua.mybatis.pojo;

import javax.management.RuntimeOperationsException;
import java.util.Scanner;
/*从键盘分别输入年、月、日，判断这一天是当年的第几天

注：判断一年是否是闰年的标准：
   1）可以被4整除，但不可被100整除
	  或
   2）可以被400整除

例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年*/
public class RunYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = scanner.nextInt();
        System.out.println("输入月份:");
        int month = scanner.nextInt();
        System.out.println("输入天数:");
        int day = scanner.nextInt();

        int sumDay = 0;
        switch (month){
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                if (year%400==0 || (year%4==0 && year%100!=0)){
                    sumDay += 29;
                }else{
                    sumDay += 28;
                }
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
            default:
                System.out.println("月份信息有误");
        }

        System.out.println("这是今年的第：" + sumDay + "天");
        scanner.close();
    }
}
