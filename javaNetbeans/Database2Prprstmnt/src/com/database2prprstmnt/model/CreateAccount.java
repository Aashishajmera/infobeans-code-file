package com.database2prprstmnt.model;

public class CreateAccount {
    private Integer id;
    private String name;
    private String father;
    private Boolean toActive;

    // constructor.......
    public CreateAccount() {
    }

    public CreateAccount(String name, String father, Boolean toActive) {
        this.name = name;
        this.father = father;
        this.toActive = toActive;
    }

    
    
    public CreateAccount(Integer id, String name, String father, Boolean toActive) {
        this.id = id;
        this.name = name;
        this.father = father;
        this.toActive = toActive;
    }
    
    
    // setter and getter........

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Boolean getToActive() {
        return toActive;
    }

    public void setToActive(Boolean toActive) {
        this.toActive = toActive;
    }
    
    
    
}
