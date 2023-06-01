package package_person_homework2;

public class PersonDetails1 {

    public static void main (String[] args) {

        Person1 firstPerson;
        Person1 secondPerson;

        firstPerson = new Person1();
        secondPerson = new Person1();

        firstPerson.name = "Cathy Jones";
        firstPerson.age = 33;
        firstPerson.gender = 'F';
        firstPerson.carAge = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.age = 22;
        secondPerson.gender = 'M';
        secondPerson.carAge = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 570;


        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustmentForCarAge = 0;
        double total1;
        double total2;

        total1 = monthlyRate + adjustedRate + adjustmentForCarAge;
        int carAge;

        firstPerson.display();
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.getCarAge(adjustmentForCarAge) + " dollars");
        System.out.println();

        secondPerson.display();
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.getCarAge(adjustmentForCarAge) + " dollars");
        System.out.println();

    }
}
