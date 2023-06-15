import java.util.Scanner;

public class ExpandDailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price;
        int quantity;
        double total;
//        double groupDiscount  = quantity * price / 1.10;
//        double biggerGroupDiscount = total / 1.20;

//        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//        String [] weekends = {"Saturday, Sunday"};

        boolean Saturday = specials.equals("Saturday");
        boolean Sunday = specials.equals("Sunday");

        while (Saturday || Sunday) {

            System.out.println("Please enter a weekday, not weekend!");

            specials = input.next();

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
                    } else if (quantity > 1 && quantity < 5) {
                        System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" dollars");
                    } else if (quantity >= 5 && quantity < 9) {
                        System.out.println("Looks like you qualify for a group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.10);
                        System.out.println(" dollars! ");
                    } else {
                        System.out.println("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.20);
                        System.out.println(" dollars! ");
                    } // end Monday
                }
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
                    } else if (quantity > 1 && quantity < 5) {
                        System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" dollars");
                    } else if (quantity >= 5 && quantity < 9) {
                        System.out.println("Looks like you qualify for a group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.10);
                        System.out.println(" dollars! ");
                    } else {
                        System.out.println("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.20);
                        System.out.println(" dollars! ");
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
                    } else if (quantity > 1 && quantity < 5) {
                        System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" dollars");
                    } else if (quantity >= 5 && quantity < 9) {
                        System.out.println("Looks like you qualify for a group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.10);
                        System.out.println(" dollars! ");
                    } else {
                        System.out.println("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.20);
                        System.out.println(" dollars! ");
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
                    } else if (quantity > 1 && quantity < 5) {
                        System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" dollars");
                    } else if (quantity >= 5 && quantity < 9) {
                        System.out.println("Looks like you qualify for a group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.10);
                        System.out.println(" dollars! ");
                    } else {
                        System.out.println("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " + quantity + " " + coffee + "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.20);
                        System.out.println(" dollars! ");
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
                    } else if (quantity > 1 && quantity < 5) {
                        System.out.println(quantity + " " + coffee + "s have been ordered totalling");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" dollars");
                    } else if (quantity >= 5 && quantity < 9) {
                        System.out.println("Looks like you qualify for a group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.10);
                        System.out.println(" dollars! ");
                    } else {
                        System.out.println("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", quantity * price);
                        System.out.println(" You have ordered " +quantity+ " " +coffee+ "s but will only be charged ");
                        System.out.printf("$%.2f", quantity * price / 1.20);
                        System.out.println(" dollars! ");
                    } // end if/else
                } // end Friday

                //  input.close(); // results in error

            } // end switch

            // input.close(); // results in IllegalStateException, googled, don't understand the error!

        } // end while

        input.close(); // works when Saturday or Sunday is entered, or when Monday is entered after incorrectly entering Sat/Sun first, else stops after a weekday is entered with code 0 - UGH!!!!

    } //end main

} // end class
