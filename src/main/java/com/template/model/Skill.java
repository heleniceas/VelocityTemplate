package com.template.model;

import java.util.List;
import java.util.Map;

public class Skill {

    private int id;
    private List<String> list;
    private Map<String, String> map;

    public int getId() {
        return id;
    }

    public Skill setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    private  String name;

    public List<String> getList() {
        return list;
    }

    public Skill setList(List<String> opcao) {
        this.list = opcao;
        return this;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Skill setMap(Map<String, String> map) {
        this.map = map;
        return this;
    }


}
