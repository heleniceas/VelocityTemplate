package com.template.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {

    private String name;
    private int age;
    private String[] position;              // array
    private List<Skill> skills;            // list
    private Map<String, BigDecimal> salary; // map

    //getters and setters


    public String getName() {
        return name;
    }

    public Staff setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Staff setAge(int age) {
        this.age = age;
        return this;
    }

    public String[] getPosition() {
        return position;
    }

    public Staff setPosition(String[] position) {
        this.position = position;
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Staff setSkills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public Staff setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
        return this;
    }
}