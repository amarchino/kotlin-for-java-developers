package academy.learnprogramming.section9;

import java.io.IOException;

public class CallKotlinFromJava {
    public static void main(String[] args) {
        // KotlinCarCodeKt.topLevel();
        StaticCar.topLevel();

        StaticCar.print("print this Java string");

        KotlinCar car = new KotlinCar("blue", "BMW", 2011, true);
        System.out.println(car.model);
        car.setColor("purple");
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());

        // KotlinCar.Companion.carComp();
        KotlinCar.carComp();
        // SingletonObj.INSTANCE.doSomething();
        SingletonObj.doSomething();
        //System.out.println("isAuto = " + KotlinCar.Companion.isAuto());
        System.out.println("isAuto = " + KotlinCar.isAuto());
        System.out.println("Constant field: " + KotlinCar.constant);

        //car.printMe(null);
        try {
            StaticCar.doIO();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        StaticCar.defaultArgs("The number is : ", 40);
        StaticCar.defaultArgs("With default value!");
    }
}
