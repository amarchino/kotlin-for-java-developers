package academy.learnprogramming.section9;

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


    }
}
