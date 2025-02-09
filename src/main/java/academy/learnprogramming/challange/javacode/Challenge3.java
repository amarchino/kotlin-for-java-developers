package academy.learnprogramming.challange.javacode;

public class Challenge3 {
    public static class Bicycle {
        private int cadence;
        private int gear;
        private int speed;

        public Bicycle(int cadence, int gear, int speed) {
            this.cadence = cadence;
            this.gear = gear;
            this.speed = speed;
        }

        public int getCadence() {
            return cadence;
        }

        public void setCadence(int cadence) {
            this.cadence = cadence;
        }

        public int getGear() {
            return gear;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public void applyBrake(int decrement) {
            this.speed -= decrement;
        }
        public void speedUp(int increment) {
            this.speed += increment;
        }
        public void printDescription() {
            System.out.println("Bike is in gear " + gear + " with a cadence of " + cadence + " travelling at a speed of " + speed + ".");
        }
    }
    public static class MountainBike extends Bicycle {
        private int seatHeight;

        public MountainBike(int cadence, int gear, int speed, int seatHeight) {
            super(cadence, gear, speed);
            this.seatHeight = seatHeight;
        }

        public int getSeatHeight() {
            return seatHeight;
        }

        public void setSeatHeight(int seatHeight) {
            this.seatHeight = seatHeight;
        }

        @Override
        public void printDescription() {
            super.printDescription();
            System.out.println("The mountain bike has a seat height of " + seatHeight + " inches.");
        }
    }
    public static class RoadBike extends Bicycle {
        private final int tireWidth;

        public RoadBike(int cadence, int gear, int speed, int tireWidth) {
            super(cadence, gear, speed);
            this.tireWidth = tireWidth;
        }

        public int getTireWidth() {
            return tireWidth;
        }
        @Override
        public void printDescription() {
            super.printDescription();
            System.out.println("The road bike has a tire width of " + tireWidth + " mm.");
        }
    }
}
