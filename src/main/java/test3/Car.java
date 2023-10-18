package test3;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String number;
    private String owner;
    private int year;
    private List<String> owners;

    public Car(String name, String number, String owner, int year) {
        this.name = name;
        this.number = number;
        this.owner = owner;
        this.year = year;
        this.owners = new ArrayList<>();
        this.owners.add(owner);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        addOwner(owner);
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }
    public void addOwner(String owner){
        if(this.owners == null){
            this.owners = new ArrayList<>();
        }
        owners.add(owner);
    }
    public List<String> getOwners(){
        return owners;
    }
}
