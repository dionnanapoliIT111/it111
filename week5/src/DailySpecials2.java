import java.util.Scanner;

public class DailySpecials2 {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price;
        int quantity;

        boolean Saturday = specials.equals("Saturday");
        boolean Sunday = specials.equals("Sunday");

        if (Saturday || Sunday) {

            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                    System.out.printf("$%.2f", quantity * price);
                    System.out.println(" dollars");
                }
            } // end Monday
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                    System.out.printf("$%.2f", quantity * price);
                    System.out.println(" dollars");
                }
            } // end Tuesday
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                    System.out.printf("$%.2f", quantity * price);
                    System.out.println(" dollars");
                }
            } // end Wednesday
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                    System.out.printf("$%.2f", quantity * price);
                    System.out.println(" dollars");
                }
            } // end Thursday
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                    System.out.printf("$%.2f", quantity * price);
                    System.out.println(" dollars");
                }
            }
            default -> System.out.println("Please enter a valid day, or check your spelling!");
        } // end switch

        input.close();

    } // end main

}
