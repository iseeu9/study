package com.study;

public class Person {
    private int id;
    private String name;
    private String age;
    private String sex;
    private String address;
    private String telNum;
    public Person(){

    };
    public Person(String name, String age, String sex, String address, String telNum) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.telNum = telNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
     StringBuffer sb = new StringBuffer();
     sb.append("序号").append(this.id).append("#").append("\t");
     sb.append("姓名").append(this.name).append("\t\t");
     sb.append("年龄").append(this.age).append("#").append("\t\t");
     sb.append("性别").append(this.sex).append("\t\t");
     sb.append("电话号码").append(this.telNum).append("\t\t");
     sb.append("住址").append(this.address).append("\t\t");
     return  sb.toString();
    }
}
