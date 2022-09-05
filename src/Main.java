import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers to fin Minimum and press enter \r");
        int count = scan.nextInt();
        int[] array = new int[count];
        int minimum;
        MinimumElement melement = new MinimumElement();
        array = melement.readIntegers(count);
        System.out.println("array after method findMin call = " + Arrays.toString(array));
        minimum = melement.findMin(array);
        System.out.println("Minimum element in the array is = " + minimum);
    }
}
