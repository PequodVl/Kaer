package com.company;

public class C_class extends Avto{

    final String type = "C-class";
    public C_class(int maxSpeed, String name, boolean iswroking){
        this.maxSpeed=maxSpeed;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Avto{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +"type=" + type +
                '}';
    }
}
