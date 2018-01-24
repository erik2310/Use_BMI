public class Main {

    public static void main(String[] args) {

        BMI bmi1 = new BMI("Erik Ruhmanis", 22, 78,1.8);

        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

    }
}
