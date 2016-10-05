import java.text.MessageFormat;

/**
 * Created by Administrator on 10/5/2016.
 */
public class RunStatCalc {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13}; //declare and instantiate an int array with required numbers
        StatCalc myStatCalc = new StatCalc();  //declare and instantiate a StatCalc object

        //add data to stat calc object
        System.out.print("Adding numbers to data set... ");
        for (int number: numbers) {
            myStatCalc.enter(number);
            System.out.print(number + " ");
        }

        // print some stats from the numbers
        System.out.println();
        System.out.println();
        System.out.println("The count of the numbers in the set: " + myStatCalc.getCount());
        System.out.println("The mean of the set: " + myStatCalc.getMean());
        System.out.println(MessageFormat.format("The standard deviation of the set: {0,number}", myStatCalc.getStandardDeviation()));
        //trying out MessageFormat.format() to see how it works. Pretty spiffy. Still, I wish we could do string interpolation
    }
}
