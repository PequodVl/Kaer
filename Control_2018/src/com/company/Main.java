package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static int userchoise =0;
static boolean booler =true;
    public static void main(String[] args) {
        ArrayList<Avto> cars = new ArrayList<Avto>();
        cars.add(new A_class(5, "ramirez", true));
        cars.add(new B_class(7, "whiskey", false));
        cars.add(new C_class(2, "rouch", false));
        Scanner scanner = new Scanner(System.in);
        while (booler){
        System.out.println("1.Output the array");
        System.out.println("2.Add an element");
        System.out.println("3.Clear the array");
        System.out.println("4.Exit");
            System.out.println("5.Sort");
        userchoise = scanner.nextInt();
        switch (userchoise){
            case 1:
                for(int i=0; i<cars.size(); i++){
                    System.out.println(cars.get(i).toString());
            }
                break;
            case 2:
                cars.add(new C_class(3, "bravo", false));
                break;
            case 3:
                cars.clear();
                break;
            case 4:
                booler = false;
                break;
            case 5:
                sortMaxSpeed(cars);
                        break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
    }
    public static void sortMaxSpeed(ArrayList<Avto> cars){
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i -1; j++) {
                if (cars.get(j).getMaxSpeed() > cars.get(j + 1).getMaxSpeed()){
                    Avto save = cars.get(j);
                    cars.set(j, cars.get(j + 1));
                    cars.set(j + 1, save);
                }
            }
        }
    }
}
