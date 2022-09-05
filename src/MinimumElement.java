import java.util.Scanner;
public class MinimumElement {
    private final Scanner scanner = new Scanner(System.in);
    public int[] readIntegers(int count)
    {
        int[] array = new int[count];
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Enter integer number \r");
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }//for
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
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }//for
        } //while
        return array[0];
    }
}
