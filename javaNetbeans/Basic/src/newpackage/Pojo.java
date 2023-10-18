/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author hp
 */
public class Pojo {
    
    private int n ;
    private String name;

    public Pojo(int n, String name) {
        this.n = n;
        this.name = name;
    }

    public Pojo() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void displayDeta(){
        System.out.println(getName());
        System.out.println(getN());
    }
    
    
}
