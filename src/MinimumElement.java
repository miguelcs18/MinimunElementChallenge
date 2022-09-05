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
        System.out.println("array = " + Arrays.toString(array));
        return array;
    }
    public int findMin(int[] array)
    {
        boolean flag=true;
        int temp = 0;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }//for
        } //while
        return array[0];
    }
}
