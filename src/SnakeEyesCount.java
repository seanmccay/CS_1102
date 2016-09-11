import java.util.ArrayList;

/**
 * Created by Sean McCay on 9/11/2016.
 */

public class SnakeEyesCount {
    public static void main(String[] args) {
        int count = 0;
        boolean snakeEyes = false;
        do{
            count+=1;
            int die1 = (int)(Math.random()*6) + 1;
            int die2 = (int)(Math.random()*6) + 1;

            if(die1 == 1 && die2 == 1) snakeEyes = true;
        }while(!snakeEyes);

        System.out.println("It took a total of " + count + " rolls to get snake eyes.");
        System.out.println();

        count = 0;
        ArrayList<Integer> rollsNeeded = new ArrayList<Integer>();
        System.out.println("Let's get an average...");
        for(int i = 0; i < 1000; i++){
            count+=1;
            int die1 = (int)(Math.random()*6) + 1;
            int die2 = (int)(Math.random()*6) + 1;
            if(die1 == 1 && die2 == 1) {
                rollsNeeded.add(count);
                count = 0;
            }
        }

        float sumOfRolls = 0;
        for(Integer rolls : rollsNeeded) {
            sumOfRolls += rolls;
        }

        float average = sumOfRolls / rollsNeeded.size();

        System.out.println("There were " + rollsNeeded.size() + " snake eyes out of a total of 1000 rolls.");
        System.out.println("It took an average of " + average + " rolls to get snake eyes.");
    }
}
