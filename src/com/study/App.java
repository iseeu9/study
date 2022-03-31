package com.study;

/*
程序总入口
 */
public class App {
    /*
    执行方法
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();

    }
    public void start(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        Operate operate = new Operate();

        while (true){
            menu.mainMenu();
            int i = regex.menuVadix(1, 6);
            switch (i){
                case 1:operate.addLogic();break;
                case 2:operate.searchLogic();break;
                case 3:operate.updateLogic();break;
                case 4:operate.deleteLogic();break;
                case 5:operate.orderLogic();break;
                case 6:System.exit(0);
            }

        }
    };
}
