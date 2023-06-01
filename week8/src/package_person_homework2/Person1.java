package package_person_homework2;

public class Person1 {

    String name;
    char gender;

    int age;
    int carAge;

    boolean violations;
    double creditScore;

    public void display() {

        System.out.println("Your Name: " +name);
        System.out.println("Your Age: " +age);
        System.out.println("Your Car: " +carAge);
        System.out.println("Your Violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);
    }

    public double getRate(double monthlyRate) {

        if (violations == true && creditScore <= 700) {
            monthlyRate = 700.00;
        } else {
            monthlyRate = 100.00;

        }

        return monthlyRate;

    }

    public double assumeGender(double adjustedRate) {

        if(gender == 'M' && age <= 25) {
            adjustedRate = 100.00;
        } else {
            adjustedRate = 0.00;

        }

        return adjustedRate;
    }

    public double getCarAge(double adjustmentForCarAge) {

        if(carAge <= 2015) {
            adjustmentForCarAge = 100.00;
        } else {
            adjustmentForCarAge = 0.00;
        }

        return adjustmentForCarAge;
    }

}