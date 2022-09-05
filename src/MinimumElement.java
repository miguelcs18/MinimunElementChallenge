import java.util.Arrays;
import java.util.Scanner;
public class MinimumElement {
    public int[] readIntegers(int count)
    {
        Scanner scanner= new Scanner(System.in);
        int[] array = new int[count];
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Enter integer number \r");
            array[i]=scanner.nextInt();
        }//for
        //System.out.println("array = " + Arrays.toString(array));
        return array;
    }
}
