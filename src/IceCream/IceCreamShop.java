package IceCream;

import java.util.*;

/**
 * Created by Sean McCay on 9/21/2016.
 */

public class IceCreamShop {
    public static void main(String[] args) {

        // create dictionary to hold flavors and sales numbers
        Map<String, Integer> iceCreamFigures = new HashMap<String, Integer>();
        int totalSales = 0;

        //read in the file
        try {
            TextIO.readFile("path\\to\\icecream.dat");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Can't open file \"icecream.dat\" for reading!");
            System.out.println("Please make sure the file is present before");
            System.out.println("running the program.");
            System.exit(1);  // Terminates the program.
        }

        // read each line while we have not read the entire file
        while(!TextIO.eof()) {
            totalSales += 1;
            String iceCream = TextIO.getlnString(); //gets a line, which has a flavor of ice cream
            if(!iceCreamFigures.containsKey(iceCream)){
                // if the ice cream has not already been added to the list, add it now and
                // initialize the count to one

                iceCreamFigures.put(iceCream, 1);
            }
            else{
                // otherwise, find the ice cream and increase its count by one
                iceCreamFigures.put(iceCream, iceCreamFigures.get(iceCream) + 1);

                // with the hash map we have to put to update so I have to lookup the key and it's value and put the value plus one.
            }
        }

        int totalStrawberry = iceCreamFigures.get("Strawberry");
        float percentStrawberry = (float)totalStrawberry/totalSales * 100;
        TextIO.putln("A total of " + totalSales + " ice cream cones were sold.");
        TextIO.putln(totalStrawberry + " of which were Strawberry flavored. Which comes out to about " + (int)percentStrawberry + "%!");
    }
}
