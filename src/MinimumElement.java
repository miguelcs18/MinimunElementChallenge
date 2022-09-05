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
        System.out.println("array readIntegers= " + Arrays.toString(array));
        return array;
    }
    public int findMin(int[] array)
    {
        boolean flag=true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1])
                {
                    System.out.println("array[i] = " +array[i] + " is greater than array[i+1]= " + array[i+1] );
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    System.out.println("array[" + i + "] = " + array[i]);
                    System.out.println("array[" + (i+1) + "] = " + array[i+1]);
                    flag = true;
                }
            }//for
        } //while
        System.out.println("array findMin = " + Arrays.toString(array));
        return array[0];
    }
}
