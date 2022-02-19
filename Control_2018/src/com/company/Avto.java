package com.company;

import java.util.Objects;


abstract class Avto{
    int maxSpeed;
	String name;
    boolean iswroking;
    public Avto(){
        this.maxSpeed=5;
        this.name="devilmaycry5";
    }
    public Avto(int maxSpeed, String name){
        this.maxSpeed=maxSpeed;
        this.name=name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Avto{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avto avto = (Avto) o;
        return maxSpeed == avto.maxSpeed && Objects.equals(name, avto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
