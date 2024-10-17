public class ArrayDriver {
    public static void main(String[] args) {
        ArrayProcessor ap = new ArrayProcessor();

        int len = ap.getArrayLength(new String[] {"One, Twp, Three"});
        System.out.println("Array length is " +len);

    }
}
