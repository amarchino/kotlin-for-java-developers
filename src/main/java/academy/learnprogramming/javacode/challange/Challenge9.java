package academy.learnprogramming.javacode.challange;

import academy.learnprogramming.challenge.Challenge;
import academy.learnprogramming.challenge.Challenge9Employee;
import academy.learnprogramming.challenge.Challenge9Kt;

public class Challenge9 {
    public static class Employee {
        private String firstName;
        private String lastName;
        private int startYear;
        private float[] salaryLast3Years;

        public Employee(String firstName, String lastName, int startYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.startYear = startYear;
            this.salaryLast3Years = new float[3];
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getStartYear() {
            return startYear;
        }

        public void setStartYear(int startYear) {
            this.startYear = startYear;
        }

        public float[] getSalaryLast3Years() {
            return salaryLast3Years;
        }

        public void setSalaryLast3Years(float[] salaryLast3Years) {
            this.salaryLast3Years = salaryLast3Years;
        }
    }

    public static void main(String[] args) {
        // Modifying Kotlin
        /*
        KotlinStuff.sayHelloToJava("Student");
        Challenge9Employee employee = new Challenge9Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(55, 4);
        employee.takesDefault("arg1");
        */
        // Modifying java
        Challenge9Kt.sayHelloToJava("Student");
        Challenge9Employee employee = new Challenge9Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(55, 4);
        employee.takesDefault("arg1", "default");
    }
}
