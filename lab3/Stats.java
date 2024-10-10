import java.util.Arrays;

/**
 * Creates the average, minimum, maximum, and total for a group of numbers and also
 * calculates how many numbers are in the group.
 */
public class Stats {

    final int[] numbers;
    private int count;

    /**
     * Increases the amount of numbers used.
     * @param value the amount of numbers to be used in the group.
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    public int getCount() {
        return numbers.length;
    }

    /**
     * finds the largest number in the group.
     * @return the largest number within the group.
     */
    public int getMax() {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)				max = numbers[i];
        }

        return max;
    }

    /**
     * Finds the smallest number in the group.
     * @return the smallest number within the group.
     */
    public int getMin() {int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    /**
     * Calculates the sum of the numbers.
     * @return the sum of all the numbers within the group.
     */
    public int getTotal() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates the average of the numbers.
     * @return the average of the numbers within the group.
     */
    public double getAverage() {

        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            x += numbers[i];
        }

        double y = x/(double)numbers.length;

        return y;
    }

    /**
     * Creates a string of all the numbers.
     * @return a string of the numbers included in the group.
     */
    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    /**
     *
     * @param capacity the amount of numbers specified to be used in the group.
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }






}
