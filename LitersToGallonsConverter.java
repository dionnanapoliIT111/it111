public class LitersToGallonsConverter {

    public static void main (String[]args) {

        double gallons,liters;

        for(gallons = 1; gallons <= 100; gallons = gallons+4) {
                    liters =  (3.79 * gallons);

                if(gallons == 1.0) {
                    System.out.printf("%.2f", liters);
                    System.out.println(" Liters = " + gallons + " Gallon");
                } else {
                    System.out.printf("%.2f", liters);
                    System.out.println  (" Liters = " +gallons+ " Gallons");

                }

                } // end for loop

               System.out.println("All done!");

            }
        }
