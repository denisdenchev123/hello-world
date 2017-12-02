import java.io.*;
public class Main  {

    public static void main(String[] args) {
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Sellable seat = new Seat("Leon","gray", 110, "Spain",21.03);
        Rentable audi = new Audi("A4","grey", 1542,"Germany", 5,54.20);
        printme(seat);
        printme(audi);
    }
    static void printme(Car car){
        System.out.println(String.format("%s is %s and have %d horse power",car.getModel(), car.getColour(), car.getHorsePower()));
        System.out.println(car.toString());
    }
}
