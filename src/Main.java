import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers to fin Minimum and press enter \r");
        int count = scan.nextInt();
        scan.nextLine();
        int[] array = new int[count];
        int minimum;
        MinimumElement melement = new MinimumElement();
        array = melement.readIntegers(count);
        minimum = melement.findMin(array);
        System.out.println("Minimum element in the array is = " + minimum);
    }
}
