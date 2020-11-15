package com.kk.weektest;

public class Student {
    // 姓名 ；号码
    public String stuName = " ";
  
    public String num;


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String toString() {
        return "["+stuName +  "\t|"  + num + "\t]";
    }

}

