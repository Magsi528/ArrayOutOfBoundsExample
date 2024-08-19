public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds. Please check the index.");
            System.out.println("Error: " + e);
        }
    }
}
