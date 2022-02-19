package com.company;

public class B_class extends Avto{

    final String type = "B-class";
    public B_class(int maxSpeed, String name, boolean iswroking){
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
