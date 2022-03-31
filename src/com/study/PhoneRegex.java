package com.study;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class PhoneRegex {
    /*
    * 对菜单进行校验
    * */
    public int menuVadix(int min,int max) {
        //定义菜单正则表达式
        String regex = "[1-9]{1}";
        //键盘输入

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入数字，最小是" + min +"，最大是"+ max );
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int i = Integer.parseInt(input);
                if(i >= min && i<= max){
                    return i;
                }else{
                    System.out.println("输入范围有误，请重新输入");
                }

            } else {
                System.out.println("数字输入范围有误，请重新输入");

            }


        }
    }
    /*
    对姓名校验
     */
    public String nameVadix(){
        String regex="[a-zA-Z]{1,10}";

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入10位以内的字母");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("姓名输入有误，请重新输入");
            }
        }
    }
    /*
   对性别校验
    */
    public String sexVadix(){

        String regex="[m|M|F|f]{1}";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入性别（男 m or M ,女 F or f）");
            String input = scanner.nextLine();
            if(input.matches(regex)) {
                return input;
            }else {
                System.out.println("性别输入有误，请重新输入");
            }
        }
    }
    /*
   对年龄校验
    */
    public String ageVadix(){
        String regex="[1-9]{1}[0-9]{1}";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入年龄，范围在10-99");
            String input = scanner.nextLine();

            if(input.matches(regex)) {
                return input;
            }else {
                System.out.println("年龄输入范围有误，请重新输入");
            }
        }
    }
    /*
   对电话号码校验
    */
    public String telVadix(){
        String regex="(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("请输入电话号码，可以是手机号或者座机号");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("电话号码输入有误，请重新输入");
            }
        }
    }
    /*
   对地址校验
    */
    public String addVadix(){
        String regex="(\\w{1,50})";
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("请输入地址，格式为1-50位的字母或数字");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("地址格式输入有误，请重新输入");
            }
        }
    }
    /*
    测试上述方法
     */

    public static void main(String[] args){
        PhoneRegex phone = new PhoneRegex();
       /* int i = phone.menuVadix(1, 7);
        System.out.println(i);*/
       /* String s = phone.nameVadix();
        System.out.println(s);*/
   /*     String ageVadix = phone.ageVadix();
        System.out.println(ageVadix);*/
      /*  String sex = phone.sexVadix();
        System.out.println(sex);*/
       /* String tel = phone.telVadix();
        System.out.println(tel);*/
        /*String s = phone.addVadix();
        System.out.println(s);*/
    }

}

