package com.dearjua.spring6.test;

import java.util.List;

public class Clazz {
    private String clazzName;
    private String clazzNum;
    private List<Student> students;

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getClazzNum() {
        return clazzNum;
    }

    public void setClazzNum(String clazzNum) {
        this.clazzNum = clazzNum;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void printStu(){
        for (Student stu:students) {
            System.out.printf(stu.toString());;
        }
    }
}
