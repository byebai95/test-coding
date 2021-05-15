package com.bai.algo;

import java.util.Scanner;

public class DayOfYearTest {


    public static int getDayNum(){
        int dayNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scanner.nextInt();
        System.out.println("请输入月：");
        int month = scanner.nextInt();
        System.out.println("请输入日：");
        int day = scanner.nextInt();
        //todo year month day 合法性校验
        switch (month){
            case 12:{
                dayNum+=31;
            }
            case 11:{
                dayNum+=30;
            }
            case 10:{
                dayNum+=31;
            }
            case 9:{
                dayNum+=30;
            }
            case 8:{
                dayNum+=31;
            }
            case 7:{
                dayNum+=31;
            }
            case 6:{
                dayNum+=30;
            }
            case 5:{
                dayNum+=31;
            }
            case 4:{
                dayNum+=30;
            }
            case 3:{
                dayNum+=31;
            }
            case 2:{
                if( ( year%4==0  && year%100!=0) || year%400==0 ){
                    dayNum+=29;
                }else{
                    dayNum+=28;
                }

            }
            case 1:{
                dayNum+=31;
            }
            default:{

            }
        }
        return dayNum;
    }



    public static void main(String[] args) {
        System.out.println(getDayNum());
    }
}
