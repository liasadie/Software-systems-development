public class ArrayProcessor {
    public int getArrayLength(Object [] a) {
        int count = 0;
        try {
            while (true) {
                Object element = a[count];
                count++;
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of bounds.");
        }
        return count;
    }
}
