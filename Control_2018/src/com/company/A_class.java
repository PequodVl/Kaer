package com.company;

public class A_class extends Avto{

    final String type = "A-class";
    public A_class(int maxSpeed, String name, boolean iswroking){
        this.maxSpeed=maxSpeed;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Avto{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' + "type=" + type +
                '}';
    }

}
