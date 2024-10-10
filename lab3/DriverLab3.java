import java.util.Random;

/**
 * the driver of the stats class which takes 10 random numbers between 1 and
 * 100 and outputs the numbers picked, the average of those numbers, the minimum and
 * maximum numbers, the amount of numbers picked, and the total of the numbers.
 */
public class DriverLab3 {
    public static void main(String[] args) {final int VALUES = 10;

        Stats stats = new Stats(VALUES);

        Random random = new Random();

        for (int i = 0; i < VALUES; i++) {
            /*
            While the amount of numbers picked is less than the capacity, a new number is picked.
             */
            stats.addValue(random.nextInt(100));
        }

        System.out.println("Numbers stored : ");
        System.out.println(stats);

        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMin());
        System.out.println("Maximum value = " + stats.getMax());
    }}