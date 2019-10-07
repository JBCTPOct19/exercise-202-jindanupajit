package com.jindanupajit.javabootcamp.exercise2021;

public class Student {
    private long id;
    private String name;
    private Integer age;
    private Integer height;
    private String phone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
    public Integer getHeightInFeet() {
        return height/12;
    }

    public void setHeight(Integer feet, Integer inches) {
        this.height = feet*12+inches;
    }
    **/

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
