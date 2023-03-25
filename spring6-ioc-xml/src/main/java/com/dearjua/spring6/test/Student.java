package com.dearjua.spring6.test;

import java.util.Map;
import java.util.Set;

public class Student {
    private String ClassName;
    private String major;

    private Map<String ,Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

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

    public void ShowTeacher(){
        Set<Map.Entry<String, Teacher>> enties = teacherMap.entrySet();
        for (Map.Entry<String, Teacher> enter:enties){
            String name = String.valueOf(enter.getValue());
            String num = String.valueOf(enter.getKey());
            System.out.println(" id= " + num + " name= " + name);
        }
    }
    @Override
    public String toString() {
        return  "Student{" +
                "ClassName='" + ClassName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }


}
