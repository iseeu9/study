package com.study;

import javax.swing.text.html.CSS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Operate {
    private List<Person> list;


    public Operate() {
        this.list =  new ArrayList<>();
    }

    /*
        添加业务记录逻辑类
         */
    public void addLogic(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        while (true){
            menu.addMenu();
            int item = regex.menuVadix(1,3);
            switch (item){
                case 1:this.addMessage();break;
                case 2:this.selectAll();break;
                case 3:return;
            }
        }

    }
    /*
   删除业务记录逻辑类
    */
    public void deleteLogic(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        while (true){
            menu.deleteMenu();
            int item = regex.menuVadix(1,4);
            switch (item){
                case 1:this.selectAll();break;
                case 2:this.deleteByOne();break;
                case 3:this.deleteByAll();
                break;
                case 4:return;
            }
        }

    }
    /*
   修改业务记录逻辑类
    */
    public void updateLogic(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        while (true){
            menu.modifyMenu();
            int item = regex.menuVadix(1,3);
            switch (item){
                case 1:this.selectAll();break;
                case 2:this.modefyByOne();break;
                case 3:return;
            }
        }

    }
    /*
   查询业务记录逻辑类
    */
    public void searchLogic(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        while (true){
            menu.searchMenu();
            int item = regex.menuVadix(1,7);
            switch (item){
                case 1:this.searchByName();break;
                case 2:this.searchBySex();break;
                case 3:this.searchByAge();break;
                case 4:this.searchByTel();break;
                case 5:this.searchByAdd();break;
                case 6:this.selectAll();break;
                case 7:return;
            }
        }

    }
    /*
    排序业务记录逻辑类
    */
    public void orderLogic(){
        Menu menu = new Menu();
        PhoneRegex regex= new PhoneRegex();
        while (true){
            menu.orderMenu();
            int item = regex.menuVadix(1,5);
            switch (item){
                case 1:this.orderByName();break;
                case 2:this.orderByAge();break;
                case 3:this.orderBySex();break;
                case 4:this.selectAll();break;
                case 5:return;
            }
        }


    }
    /*
   添加新记录信息
    */
    public void addMessage(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String name = phoneRegex.nameVadix();
        String age = phoneRegex.ageVadix();
        String sex = phoneRegex.sexVadix();
        String address = phoneRegex.addVadix();
        String tel = phoneRegex.telVadix();
        Person person = new Person(name,age,sex,address,tel);
        this.list.add(person);
        person.setId(this.list.size());


    }
    /*
   查询所有信息
    */
    public void selectAll(){
        if(this.list.size()==0){
            System.out.println("暂时没有记录存放");
            return;
        }
        for(int i=0;i<this.list.size();i++){
            System.out.println(this.list.get(i));
        }

    }
    /*
   按姓名查找
    */
    public void searchByName(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String name= phoneRegex.nameVadix();
        boolean flag= true;
        for (int i = 0; i < this.list.size(); i++) {
            if(name.equals(this.list.get(i).getName())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("查无此人");
        }

    }
    /*
 按年龄查找
  */
    public void searchByAge(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String age= phoneRegex.ageVadix();
        boolean flag= true;
        for (int i = 0; i < this.list.size(); i++) {
            if(age.equals(this.list.get(i).getAge())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有这个年龄的人");
        }

    }
    /*
 按性别查找
  */
    public void searchBySex(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String sex= phoneRegex.sexVadix();
        boolean flag= true;
        for (int i = 0; i < this.list.size(); i++) {
            if(sex.equalsIgnoreCase(this.list.get(i).getSex())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有这个性别的人");
        }

    }
    /*
   按地址查找
    */
    public void searchByAdd(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String addr= phoneRegex.addVadix();
        boolean flag= true;
        for (int i = 0; i < this.list.size(); i++) {
            if(addr.equals(this.list.get(i).getAddress())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("查无此人");
        }

    }
    /*
  按电话查找
   */
    public void searchByTel(){
        PhoneRegex phoneRegex = new PhoneRegex();
        String tel= phoneRegex.telVadix();
        boolean flag= true;
        for (int i = 0; i < this.list.size(); i++) {
            if(tel.equals(this.list.get(i).getTelNum())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("查无此人");
        }

    }
    /*
       修改指定记录
 */
    public void modefyByOne(){
        PhoneRegex phoneRegex = new PhoneRegex();
        Menu menu = new Menu();

        int item = phoneRegex.menuVadix(1,this.list.size());
        System.out.println("请输入你要修改的序号");
        menu.subModifyMenu();
        int menuItem = phoneRegex.menuVadix(1,6);
        switch (menuItem){
            case 1: String name = phoneRegex.nameVadix();(this.list.get(item-1)).setName(name);break;
            case 2: String age = phoneRegex.ageVadix();(this.list.get(item-1)).setAge(age);break;
            case 3: String sex = phoneRegex.sexVadix();(this.list.get(item-1)).setSex(sex);break;
            case 4: String tel = phoneRegex.telVadix();(this.list.get(item-1)).setTelNum(tel);break;
            case 5: String addr = phoneRegex.addVadix();(this.list.get(item-1)).setAddress(addr);break;
            case 6: return;

        }

    }
    /*
     删除指定记录
*/
    public void deleteByOne(){
        PhoneRegex phoneRegex = new PhoneRegex();
        System.out.println("请输入你要删除的序号");
        int item =phoneRegex.menuVadix(1,this.list.size());
        this.list.remove(item-1);
        //重新设置序号
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }
        System.out.println("删除成功");

    }
    /*
     删除所有记录
*/
    public void deleteByAll(){
        this.list.clear();
        System.out.println("已经全部删除成功");

    }
    /*
    按姓名排序
*/
    public void orderByName(){
        Collections.sort(this.list,new CompByName());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
            System.out.println();
        }

    }
    /*
     按年龄排序
*/
    public void orderByAge(){
        Collections.sort(this.list,new CompByAge());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }

    }
    /*
     按性别排序
*/
    public void orderBySex(){
        Collections.sort(this.list,new CompBySex());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }

    }
    /*
    比较器
     */
    //姓名比较器
    class CompByName implements Comparator<Person>{


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    //性别比较器
    class CompBySex implements Comparator<Person> {


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }
    //年龄比较器
    class CompByAge implements Comparator<Person>{


        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }



}
