package com.dearjua.spring6;

public class Student {
    private String ClassName;
    private String major;

    public String getClassName() {
        return ClassName;
    }

    public String getMajor() {
        return major;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ClassName='" + ClassName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
