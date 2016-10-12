/**
 * Created by Sean McCay on 10/12/2016.
 */
public class MatchBox extends Box {
    double weight;
    double volume;
    double weightOfWater = 0.3611;

    MatchBox(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void getVolume(){
        System.out.println("Width of MatchBox is: " + width);
        System.out.println("Height of MatchBox is: " + height);
        System.out.println("Depth of MatchBox is: " + depth);
        volume = width * height * depth;
        calculateWeight();
        System.out.println("Volume is : " + volume);
    }

    void calculateWeight(){
        weight = volume * weightOfWater;
        System.out.println("Weight of MatchBox is: " + weight);
    }

    public static void main(String[] args) {
        MatchBox matchBox = new MatchBox(5, 10, 3);
        matchBox.getVolume();
    }
}
